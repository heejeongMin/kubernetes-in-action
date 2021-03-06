Chapter 9. 디플로이먼트: 선언적 애플리케이션 업데이트
---

## 파드에서 실행 중인 애플리케이션 업데이트
현재 이미지의 버전이 v1이고, 최신 버전의 애플리케이션을 개발해 v2로 태그가 지정되는 경우가 있다고 가정하였을 시 
모든 파드를 업데이트하는 방법은 두 가지가 있을 수 있고, 수동/자동 둘다 가능하다. 

1. 기존 파드를 모두 삭제한 다음 새 파드를 시작한다. 
    - 단점 : 짧은 시간동은 애플리케이션을 사용할 수 없다.
2. 새로운 파드를 시작하고, 기동하면 기존 파드를 삭제한다. 새 파드를 모두 추가한 후 한꺼번에 기존파드를 삭제하거나 순차적으로 새 파드를 추가하고 기존 파드를 점진적으로 제거할 수도 있다.
    - 단점 : 동시에 두 가지 버전이 실행된다. 애플리케이션이 데이터 저장소에 데이터를 저장하는 경우 새 버전이 이전 버전을 손상시킬 수 있는 
    데이터 스키마나 데이터의 수정을 해서는 안된다.
    
### 오래된 파드를 삭제하고 새 파드로 교체
- 레플리케이션컨트롤러는 새 인스턴스를 생성할 때 업데이트된 파드 템플릿을 사용한다.  

 -> v1 파드 세트를 관리하는 레플리케이션 컨트롤러의 이미지 버전을 v2를 참조하도록 템플릿을 수정한 다음 이전 파드 인스턴스를 삭제해 쉽게 교체할 수 있다.  
 -> 레플리케이션컨트롤러는 레이블 셀렉터와 일치하는 파드가 없다면 새로운 인스턴스를 시작한다. 
 -> 만일 이전 파드가 삭제되고 짧은 시간 동안 다운타임을 허용한다면 가장 간단한 방법이다.
 
 ![rc_update_pod.png](img/rc_update_pod.png)  

### 새 파드 기동과 이전 파드 교체
#### 한 번에 이전 버전에서 새 버전으로 전환 
- 블루-그린 디플로이먼트 
    1. 파드 앞의 서비스는 새 버전의 파드를 불러오는 동안 이전 버전과 연결된다. 
    2. 새 파드가 모두 실행되면, 서비스의 레이블 셀렉터를 변경하고 새 파드를 바라보게 한다.  
        ```shell script
           kubectl set selector
        ``` 
    3. 전환 후 새 버전이 올바르게 작동하면 이전 레플리케이션컨트롤러를 삭제하여 이전 파드를 삭제할 수 있다.
    
    ![blue_green.png](img/blue_green.png)  
 

#### 롤링 업데이트 수행 
- 파드를 단계별로 교체하는 방법으로 천천히 scale down/up을 진행한다. 서비스의 파드 셀렉터에 이전 파드와 새 파드를 모두 포함하게 한다. 

![rolling.png](img/rolling.png)  


## 레플리케이션컨트롤러로 자동 롤링 업데이트 수행
### 애플리케이션의 초기 버전 실행

1. 파드 3개와 로드밸런서 1 개를 만든다. 
```yaml
apiVersion: v1
kind: ReplicationController
metadata:
  name: kubia-v1
spec:
  replicas: 3
  template:
    metadata:
      name: kubia
      labels:
        app: kubia
    spec:
      containers:
      - image: luksa/kubia:v1
        name: nodejs
---
apiVersion: v1
kind: Service
metadata:
  name: kubia
spec:
  type: LoadBalancer
  selector:
    app: kubia
  ports:
    - port: 8080
      targetPort: 8080 
```
- 파드와 로드밸런서를 띄운후 curl 요청을 날리는 스크립트를 실행해 놓는다.  
```shell script
while true;
do curl http://127.0.0.1:8080;
sleep 30;
done
```

![curl_script.png](img/curl_script.png)  

2. kubectl을 이용한 롤링업데이트
새로운 이미지를 받아서 업데이트하도록 명령어를 실행한다. 
```shell script
kubectl rolling-update kubia-1 kubia-2 --image=luksa/kubia:v2
```
> rolling-update 명령어 사라짐. 



## 애플리케이션을 선언적으로 업데이트하기 위한 디플로이먼트 사용하기
- 낮은 수준의 개념으로 간주되는 리플리케이션컨트롤러 또는 레플리카셋을 통해 수행하는 대신, 애플리케이션을 배포하고, 선언적으로 
업데이트하기 위한 높은 수준의 리소스가 디플로이먼트이다.
- 디플로이먼트를 생성하면 리플리카셋 리소스가 그 아래 생성이 된다. 리플리카셋은 차세대 리플리케이션컨트롤러이므로, 레플리케이션 컨트롤러 대신 레플리카셋을 사용해야 한다.
- 디플로이먼트를 사용하는 경우, 실제 파드는 디플로이먼트가 아닌 디플로이먼트의 리플리카셋에 의해 생성되고 관리된다. 

    ![deployment_rcset.png](img/deployment_rcset.png)  
    
### 디플로이먼트 생성
```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: kubia
  labels:
    app: kubia
spec:
  replicas: 3
  selector:
    matchLabels:
      app: kubia
  template:
    metadata:
      name: kubia
      labels:
        app: kubia
    spec:
      containers:
        - name: nodejs
          image: luksa/kubia:v1
```

### 디플로이먼트 롤아웃 상태 출력
일반적인 디플로이먼트 세부 사항 보기 
```shell script
kubectl get deployment
kubectl describe deployment
``` 
![describe_deployment.png](img/describe_deployment.png)  

디플로이먼트 상태를 보기 위한 명령어
```shell script
kubectl rollout status deployment kubia
```
디플로이먼트로 생성하게 되면 레플리케이션컨트롤러와 다른점은 컨트롤러 이름과 임의로 생성된 문자열로 구성에서 중간에 숫자가 추가되는 다른점이 있다.  
![deployment_name.png](img/deployment_name.png)  
- 이 숫자가 의미하는 것은, 디플로이먼트와 파드 템플릿의 해시값을 의미하며, 레플리카셋이 이런 파드를 관리한다. 
: <디플로이먼트 이름>-<레플리카셋 해시값>-<파드 해시값>
![get_replicaset.png](img/get_replicaset.png)  


### 디플로이먼트 업데이트
- 사용 가능한 디플로이먼트 전략
    - 기본은 RollingUpdate라는 롤링 업데이트 전략이다.
    - 대안으로 Recreate 전략이 있는데, 수정 후 모든 파드를 삭제 후 진행하기 때문에 다운타임이 생긴다. 
    
- 데모 목적으로 롤링 업데이트 속도 느리게 하기
```shell script
kubectl patch deployment kubia -p '{"spec": {"minReadySeconds":10}}'
```
    - 디플로이먼트 스펙을 변경하였지만, 파드 템플릿을 변경한 것은 아니기 때문에 파드가 업데이트되지는 않는다. 

- 롤링 업데이트 시작
    - 롤링업데이트 프로세스의 진행사항을 추적하려면 먼저 다른 터미널에서 curl 요청을 보내볼 수있다. 
    
- 디플로이먼트의 파드 스펙을 변경해보기 
```shell script
kubectl set image deployment kubia nodejs=luksa/kubia:v2
```
![set_image.png](img/set_image.png)  

> 디플로이먼트와 그 외의 리소스를 수정하는 방법
> 1. kubectl edit : 기본 편집기로 오브젝트의 메니페스트를 편집. 변경 후 파일을 저장하고 편집기를 종료 하면 반영된다. 
>    ex ) kubectl edit deployment kubia
> 2. kubectl patch : 오브젝트의 개별 속성을 수정한다. 

![way_to_edit.png](img/way_to_edit.png)  

- 변경 후 디플로이먼트의 리플리카셋을 조회해 보면 새로운 스펙의 파드를 띄우고 있는 것을 확인할 수 있따.
```shell script
kubectl get rs
```
![get_rs.png](img/get_rs.png)  
![get_po.png](img/get_po.png)  

![deployment_update_rollout.png](img/deployment_update_rollout.png)  


#### 디플로이먼트 롤백
1. 이전버전으로 롤백 
```shell script
kubectl rollout undo deployment kubia
```
2. 특정버전으로 롤백 
```shell script
 kubectl rollout undo deployment kubia --to-reivision=1
```
![undo.png](img/undo.png)

- 위에서 새 버전을 배포했을때 이전에 사용한 레플리카셋이 비활성화 된 상태로 남아 있었는데 이 것이 개정 이력에서 참조되게 된다. 
각 레플리카 셋은 해당 특정 버전에서의 디플로이먼트의 전체 정보를 저장함으로, 수동으로 삭제하면 안된다. 수동으로 삭제가 되면 
디플로이먼트 기록에서 특정버전을 읽어서 롤백할 수 없게 된다. 
- 개정 내역의 수는 editionHistroyLimit 속성에 의해 제한되며, 기본값은 10 이며, 이전 리플리카셋은 자동으로 삭제된다. 

#### 디플로이먼트 히스토리
```shell script
 kubectl rollout history deployment kubia
```
- 근데 조회하니 change-cause가 모두 none으로 나오는데 이유는 내가 deployment 를 띄울 때 --record 옵션을 주지 않아서 그렇다. 
![wo_record.png](img/wo_record.png)    

이력을 보기 위해 옵션을 주고 다시 시작한다. 
```shell script
kubectl apply -f kubia-deployment-v1.yaml --record
```
근데 ... 이력이 apply 이력만 계속 나오네 .. ㅠ.ㅠ ? 

![weird_history.png](img/weird_history.png) 

### 롤아웃 속도 제어
- maxSurge : 디플로이먼트가 의도하는 레플리카 수보다 얼마나 많은 파드 인스턴스 수를 허용할 수 있을지 정한다. 
기본은 25%로 설정되고, 의도한 개수보다 최대 25% 더 많은 파드 인스턴스가 있을 수 있다는 뜻이다.
- maxUnavailable : 업데이트중 의도하는 레플리카 수를 기준으로 사용할 수 없는 파드 인스턴스의 수이다. (기본 25%)

-> min/max 파드를 말하는 것 같음. 최소 몇개는 무조건 떠있어야 하고, 최대 몇개까지만 띄우면서 롤링배포 할수 있다는 ..  
![maxSurge_maxUnavailable1.png](img/maxSurge_maxUnavailable1.png) 
![maxSurge_maxUnavailable2.png](img/maxSurge_maxUnavailable2.png) 

### 롤아웃 일시 중지/재개
- 롤아웃 일시 중지
```shell script
kubectl rollout pause deployment kubia
```
- 롤아웃 재개
```shell script
kubectl rollout resume deployment kubia
```

### 잘못된 버전의 롤아웃 방지
- 앞에서 minReadSecond 를 주고 배포 속도를 늦추었는데, 이 기능을 사용하면 오작동 버전의 배포를 방지 하는 효과를 얻을 수 있다.
- 일반적으로 파드는 실제 트래픽을 수신하기 시작한 후 파드가 준비 상태를 계속 보고 할 수 있도록 minReadySeconds를 훨씬 높게 설정한다. 
- 버전 v3이 완전히 롤아웃 되는 것을 방지하기 위한 레디니스 프로브 정의
```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: kubia
  labels:
    app: kubia
spec:
  replicas: 3
  minReadySeconds: 10
  strategy:
    rollingUpdate:
      maxSurge: 1
      maxUnavailable: 0
    type: RollingUpdate
  selector:
    matchLabels:
      app: kubia
  template:
    metadata:
      name: kubia
      labels:
        app: kubia
    spec:
      containers:
        - name: nodejs
          image: luksa/kubia:v3
          readinessProbe:
            httpGet:
              path: /
              port: 8080
            periodSeconds: 1
```
- v3은 요청을 받다가 500에러가 나는 이미지였기 때문에 파드가 준비되지 않는다. maxUnavailable 속성을 0으로 설정 했기때문에 원래 파드도 제거하지 않는다. 
- 만일 이런 경우 minReadySeconds를 올바르게 설정하지 않고 레디니스 프로브만 정의하는 경우, 레디니스 프로브의 첫번째 호출이 성공하면, 
즉시 새 파드가 사용 가능한 것으로 간주되니, minReadySeconds를 적절하게 설정해야한다.  
![pod_not_ready.png](img/pod_not_ready.png) 

- 롤아웃 데드라인 설정
    - 기본적으로 롤아웃이 10분동안 진행되지 않으면 실패한 것으로 간주한다. 스펙 수정은 progressDeadlineSeconds 속성으로 할 수 있다.
    - 아래 스크린샷처럼 실패한것 까지 확인 되면, 롤아웃이 계속 진행되지 않음으로 취소 할 수 있따. 그런데 아예 yaml을 새로 시작한거라, 
      이전 히스토리가 없기 때문에 no rollout history found for deployment "kubia" 가 나온다. 만약에 수정하고 apply했었으면 업데이트가 되어서 이력이 남아있었을것. 
        ```shell script
          kubectl rollout undo deployment kubia
       ```
![deadline.png](img/deadline.png) 


https://kubernetes.io/ko/docs/concepts/workloads/controllers/deployment/