Chapter5. 서비스: 클라이언트가 파드를 검색하고 통신을 가능하게 함
---

파드가 다른 파드에게 제공하는 서비스를 사용하려면 다른 파드를 찾는 방법이 필요하다.
 - 쿠버네티스 이전엔 시스템 관리자가 클라이언트 구성 파일에 서비스를 제공하는 서버의 정확한 IP 주소나 호스트 이름을 지정
 - 쿠버네티스에서는 다음과 같은 이유로 그 동안의 방식을 사용할 수 없다. 
    1. 파드는 일시적. (노드에서 제거되거나, 장애로 다른노드로 언제든지 이동)
    2. 노드에 파드를 스케줄링한 후 파드가 시작되기 바로 전에 파드의 IP주소를 할당하기 때문에 미리 알 수 없다.
    3. 수평 스케일링은 여러 파드가 동일한 서비스를 제공 할 수 있고, 각 파드는 고유의 IP 주소가 있지만 클라이언트는 파드의 수, IP주소를 상관하지 않아야한다.
    
    
### 서비스
동일한 서비스를 제공하는 파드 그룹에 지속적인 단일 접점을 만들려고 할때 생성하는 리소스이다.

![internal-external-client-using-service.png](img/internal-external-client-using-service.png)

- 웹 서버가 하나든 수백 개든 상관없이 외부 클라이언트는 프론트엔드 파드에 연결 할 수 있어야한다.
    - 프론트엔드 파드에 관한 서비스를 만들고 클러스터 외부에서 액세스할 수 있도록 구성하면 외부 클라이언트가 파드에 연결할 수 있는 하나의 고정 IP가 노출된다.
- 프론트엔드 파드는 백엔드 데이터베이스에 연결해야 한다. 
    - 마찬가지로 백엔드 파드에 관한 서비스를 생성해 안정적인 주소를 만들어 파드의 IP주소가 변경되어도 서비스의 IP주소는 변경되지 않게 한다. 
    - 프론트엔드 파드에서 환경변수 또는 DNS이름으로 백엔드 서비스를 쉽게 찾을 수 있다. 
    
#### 서비스 생성
서비스가 지원하는 파드가 한개 혹은 그 이상일 수 있는데, 연결은 서비스 뒷단의 모든 파드로 로드밸런싱 된다.
그럼, 어떤 파드가 어떤 서비스의 일부분인지 어떻게 알 수 있을까 ?
    - 레이블 셀렉터 (label selector)를 통해 그룹화할 할 수 있다.
    ![service-pod-label-selector.png](img/service-pod-label-selector.png)
    
- YAML 디스크립터를 통한 서비스 생성
서비스를 생성하는 가장 쉬운 방법은 "kubectl expose"를 사용하는 것이지만 관리를 위해 YAML을 사용하자. 
책이랑 달리 추가한 점은 spec.type: LoadBalancer인데 이유는 서비스에 대한 external Ip를 얻어야하는데 minikube tunnel 을 열어도 찾지 못하는 것이다. 
LoadBalancer로 인지하지 못해서 그런것 같아 추가하니 minikube tunnel 명령어 호출 시 external IP를 할당해 주는 것을 볼 수 있다. 
이후 "curl http://127.0.0.1:8080/crane" 하면 응답이 돌아오는것을 확인 가능.
도움받은 링크 : https://stackoverflow.com/questions/61999850/minikube-external-ip-not-match-hosts-public-ip
```yaml
apiVersion: v1
kind: Service
metadata:
 name: crane-http
 labels:
  app: crane
spec:
 ports:
 - port: 8080
   protocol: TCP
   targetPort: 8080
 selector:
   app: crane
 type: LoadBalancer
```
![minikube-tunnel-works-after-add-type-loadbalancer.png](img/minikube-tunnel-works-after-add-type-loadbalancer.png)
![minikube-tunnel-assign-external-ip.png](img/minikube-tunnel-assign-external-ip.png)

클러스터 내에서 서비스 테스트
    1. 서비스 클러스터 IP로 요청을 보내고 응답을 로그로 남기는 파드를 만드는 방법이 있다. 파드의 로그를 검사해 응답을 확인한다.
2. 쿠버네티스 노드로 ssh 접속하고 curl명령을 실행하는 방법이 있다. 
3. 실행중인 컨테이너에 원격으로 명령어 실행
    > "kubectl exec" 명령어를 사용하면 기존 파드의 컨테이너 내에서 원격으로 임의의 명령어를 실행할 수 있다. 
컨테이너의 내용/상태/환경을 검사할 때 유용하다. 
    1. kubectl get pods 명령어로 파드를 조회하여 파드의 이름을 확인
    2. 서비스 클러스터의 IP를 알기위해 kubectl get svc 를 통해 CLUSTER-IP 확인
3. 찾은 정보를 사용하여 kubectl exec 명령어를 사용하여 기존 파드의 컨테이너 내에서 원격으로 명령어 실행
    ```yaml
    kubectl exec crane-chgqh -- curl -s http://10.96.49.75:8080/crane
    ```
    * 더블대시(--)는 kubectl 명령줄 옵션의 끝을 의미한다. 더블 대시 뒤의 모든 것은 파드 내에서 실행되어야 하는 명령어이다.
      만일 더블 대시가 없다면 -s 옵션이 kubectl exec의 옵션으로 간주되어 실행된다. (-s 는 kubectl에게 기본값과 다른 API 서버에 연결하도록 지시)
![how-kubectl-exec-curl-works.png](img/how-kubectl-exec-curl-works.png)

- 서비스의 세션 어피니티 구성
동일한 명령을 몇 번 더 실행하면 동일한 클라이언트에서 요청하더라도 서비스 프록시가 각 연결을 임의의 파드를 선택해 연결을 다시 전달 하기 때문에
요청할 때마다 다른 파드가 선택된다.  
![curl-runs-different-pods.png](img/curl-runs-different-pods.png)

만일 특정 클라이언트의 요청을 매번 같은 파드로 리다이렉션해야한다면 서비스의 세션 어피니티(session affinity) 속성을 기본값 None대신 ClientIp로 설정한다. 
> If you want to make sure that connections from a particular client are passed to the same Pod each time, you can select the session affinity based on the client's IP addresses by setting service.spec.sessionAffinity to "ClientIP" (the default is "None"). You can also set the maximum session sticky time by setting service.spec.sessionAffinityConfig.clientIP.timeoutSeconds appropriately. (the default value is 10800, which works out to be 3 hours).
```yaml
apiVersion: v1
kind: Service
metadata:
 name: crane-http
 labels:
  app: crane
spec:
 ports:
 - port: 8080
   protocol: TCP
   targetPort: 8080
 selector:
   app: crane
 type: LoadBalancer
 sessionAffinity: ClientIP #하나의 클라이언트가 하나의 파드에만 들어오게 하고 싶을 때
```
![sessionAffinity-sticks-to-one-pod.png](img/sessionAffinity-sticks-to-one-pod.png)

   ** 쿠버네티스의 서비스는 TCP와 UDP 패킷을 처리하고 그들이 가지고 있는 페이로드는 신경쓰지 않는다. 쿠키는 HTTP 프로토콜의 구성이기 때문에
서비스는 쿠키를 알지 못함으로, 세션 어피니티를 쿠키 기반으로 할 수는 없다.
  
  
- 동일한 서버에서 여러 개의 포트 노출
    - 서비스는 단일 포트만 노출하지만 여러 포트를 지원할 수도 있다. 예를 들어 파드가 두개의 포트 (HTTP: 8080, HTTPS: 8443)
    를 수신한다면, 하나의 서비스를 사용해 포드 80, 443을 포트 8080, 8443에 바인딩 시킬 수 있다. 여러 보트가 있는 
    서비스를 만들때에는 각 포트의 이름을 정해주어야 한다. 
    ```yaml
    apiVersion: v1
    kind: Service
    metadata:
     name: crane-http
     labels:
      app: crane
    spec:
     ports:
     - name: http
       port: 80
       targetPort: 8080
     - name: https
       port: 443
       targetPort: 8443
     selector:
       app: crane
     type: LoadBalancer
    ```
혹은 pod에 직접 포트 이름을 주면 서비스에서 targetPort에 포트 이름으로 찾을 수 있다.  
이름을 사용하였을 때의 장점은 서비스 스펙을 변경하지 않고도 포트를 변경할 수 있는 큰 장점이 있다.
http라는 이름의 포트 8080을 사용하고 있지만 추후 80으로 변경하기로 했다면 서비스는 변경이 없어도 된다. 

![pod-port-name.png](img/pod-port-name.png)

#### 서비스 검색
클라이언트 파드가 서비스의 IP의 포트를 검색할 수 있는 방법은 ?
1. 환경변수를 통한 서비스 검색결
    - 파드가 시작되면, 쿠버네티스는 해당 시점에 존재하는 각 서비스를 가리키는 환경변수 세트를 초기화한다.
    - 클라이언트 파드를 생성하기 전에 서비스를 생성하면 해당 파드의 프로세스는 환경변수를 검사해 서비스 IP주소와 포트를 얻는다.    
  반대로 파드를 만든 후에 서비스를 만들면 서비스에 대한 환경변수를 설정할 수 없다.  
  
        a. 이미 생성되어 있는 파드를 삭제하고 레플리케이션 컨트롤러를 통해 새로 만든다. 
            ```yaml
               pod를 직접 생성한 경
               kubectl delete po --all 
               
               replication controller를 통해 생성한 경우 
               kubectl delete rc crane
           
               생성
               kubectl create -f replication-controller.json 
            ```
        b. 컨테이너 내부에서 환경변수 조회
            ```yaml
               kubectl get pods
               kubectl exec crane-djxcr env
            ```
            ![kubectl_exec_pod_env.png](img/kubectl_exec_pod_env.png)
        
            > 서비스 이름의 대시(-)는 밑줄(_)로 변경되고, 서비스 이름이 환경변수 이름의 접두어로 사용되면서 모두 대문자로 표시된다.

2. DNS를 통한 서비스 검색  
    - 파드는 DNS 서버를 실행하며, 클러스터에서 실행 중인 다른 모든 파드는 자동으로 이를 사용하도록 구성된다. 
(쿠버네티스는 각 컨테이너의 /etc/resolv.conf 파일을 수정해 이를 수행한다.)
    - 파드에서 실행중인 프로세스에서 수행된 모든 DNS 쿼리는 시스템에서 실행 중인 모든 서비스를 알고 있는 쿠버네티스의 자체 DNS 서버로 처리된다.
      파드가 내부 DNS 서버를 사용할지 여부는 각 파드 스펙의 dnsPolicy 속성으로 구성할 수 있다.
    - 각 서비스는 내부 DNS 서버에서 DNS 항목을 가져오고, 서비스 이름을 알고 있는 클라리언트 파드는 환경변수 대신 FQDN(정규화된 도메인 이름)으로 액세스 할 수 있다.
    
3. FQDN을 통한 서비스 연결
    - 지금까지는 서비스 Cluster-IP로 연결을 하였는데, 이제 FQDN으로 연결을 할 수 있다. 
        > crane-http.default.svc.cluster.local
        - crane-http : 서비스 이름
        - default : 서비스가 정의된 네임스페이스
        - svc.cluster.local : 모든 클러스터의 로컬 섭시스 이름에 사용되는 클러스터의 도메인 접미사
        
        a. 파드의 컨테이너에서 셸 실행
        ```shell script
          kubectl exec -it crane-djxcr bash
        ```
        b. FQDN으로 접근
        - 파드 컨테이너 내부의 DNS resolver가 구성돼 있기 때문에 네임스페이스와 svc.cluster.local접미사를 모두 생략할 수 있다. 
        ![FQDN.png](img/FQDN.png)
        - /etc/resolv.conf 파일 확인
        ![pod_etc_resolv.conf.png](img/pod_etc_resolv.conf.png)
      
    > 서비스가 정상적으로 작동하는지 알아보기위해 ping을 날려볼 수 있지만, 응답은 돌아오지 않는다. 서비스 클러스터 IP가 가상IP이기 때문인데 11장에서 더 자세히 다룬다.


### 클러스터 외부에 있는 서비스 연결
#### 서비스 엔드포인트
- 서비스는 직접 파드에 연결 되지 않는다. 대신 엔드포인트 리소스라는 것 그 사이에 존재하는데 "kubectl describe" 명령어를 통해 엔드포인트를 확인할 수 있다. 
    ```shell script
    kubectl describe svc crane-http
    ```
    ![endpoint-describe.png](img/endpoint-describe.png)
    
    * 엔드포인트는 리소스는 다른 쿠버네티스 리소스와 유사함으로 kubectl get 을 사용할 수 있다.
    ```shell script
        kubectl get endpoints crane-http
    ```
    ![endpoint-describe2.png](img/endpoint-describe2.png)
    
- 파드에 selector가 없으면, 쿠버네티스는 엔드포인트 리소스를 만들지 못하는데 서비스에 포함된 파드가 무엇인지 알 수 없기 때문이다. 
- 서비스의 엔드포인트를 서비스와 분리하면 엔드포인트를 수동으로 구성하고 업데이트 할 수 있다. 수동으로 관리되는 엔드포인트를 사용해 서비스를 만들려면 서비스와 엔드포인트 리소스를 모두 만들어야한다. 
    1. 셀렉터 없이 서비스 생성
        * yml에 selector.app이 없는 상태로 구성한다. 
        ![svc-wo-selector.png](img/svc-wo-selector.png)
        
        * 이렇게 생성한 후 "kubectl describe svc crane-http"을 하면 endpoint가 이전과 달리 없는 것이 확인된다.
         ![svc-wo-endpoints.png](img/svc-wo-endpoints.png)  
         
    2. 셀렉터가 없는 서비스에 관한 엔드포인트 리소스 생성
        * 이 경우, 엔드포인트는 별도의 리소스 이며, 서비스에 속성이 아니게 된다. i 에서 셀렉터가 없는 서비스를 생성했기 때문에 엔드포인트 리소스가 자동으로 생성되지 않음으로 
          엔드포인트 리소스를 위한 yml 메니페스트를 만들어야 한다. 
    



   





