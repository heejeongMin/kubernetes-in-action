Chapter7. 애플리케이션에서 파드 메타데이터와 그 외의 리소스에 액세스하기
---

이번 장에서 알아보는 주제
1. 특정 파드와 컨테이너 메타데이터를 컨테이너로 전달하는 방법
2. 컨테이너 내에서 실행 중인 애플리케이션이 쿠버네티스 API 서버와 통신해 클러스터에 배포된 리소스 정보를 얻는 방법

참고 : 
https://kubernetes.io/ko/docs/tasks/inject-data-application/environment-variable-expose-pod-information/

## Downward API로 메타데이터 전달
- 정의   
파드 및 컨테이너 필드/메타데이터 실행 중인 컨테이너에 노출하는 두 가지 방법이 있고 이를 Downward API라고 한다.

    > 1. 환경 변수  
    > 2. 볼륨 파일

노출 할 수 있는 정보

    1. 파드의 이름 
    2. 파드의 IP 주소
    3. 파드가 속한 네임스페이스
    4. 파드가 실행 중인 서비스와 어카운트* 이름
    5. 각 컨테이너의 CPU와 메모리 요청*
    6. 각 컨테이너의 CPU와 메모리 제한* 
    7. 파드의 레이블
    8. 파드의 어노테이션
     
 * 서비스 어카운트 (Service Account)  
        : API 서버와 통신할 때 인증하는 계정. 12장에서 더 자세히 다룸.
 * CPU/메모리 요청 및 제한  
        : 컨테이너에 보장되는 CPU와 메모리의 양과 컨테이너가 얻을 수 있는 최대의 양. 14장에서 더 자세히 다룸                                                     
 * Downward API로 전달할 수 없는 리소스는 레이블과 어노테이션으로 볼륨을 통해서만 노출 될 수 있다.
    
    ![downward_api_volume.png](img/downward_api_volume.png) 

### 환경변수로 메타데이터 노출 
1. 파드의 필드를 환경변수로 노출
    ```yaml
    apiVersion: v1
    kind: Pod
    metadata:
      name: dapi-envars-fieldref
    spec:
      containers:
        - name: test-container
          image: k8s.gcr.io/busybox
          command: [ "sh", "-c"]
          args:
            - while true; do
              echo -en '\n';
              printenv MY_NODE_NAME MY_POD_NAME MY_POD_NAMESPACE;
              printenv MY_POD_IP MY_POD_SERVICE_ACCOUNT;
              sleep 10;
              done;
          env:
            - name: MY_NODE_NAME
              valueFrom:
                fieldRef:
                  fieldPath: spec.nodeName
            - name: MY_POD_NAME
              valueFrom:
                fieldRef:
                  fieldPath: metadata.name
            - name: MY_POD_NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: MY_POD_IP
              valueFrom:
                fieldRef:
                  fieldPath: status.podIP
            - name: MY_POD_SERVICE_ACCOUNT
              valueFrom:
                fieldRef:
                  fieldPath: spec.serviceAccountName
      restartPolicy: Never
    ```
    * fieldPath는 값을 참고할 경로를 나타내는데 파일을 생성후 ``` kubectl get po -o yaml ``` 명령어로 쉽게 참조 필드를 확인할 수 있다.
    * 설정한 환경변수는 파드에 접근하여서 모든 환경변수를 확인하면서도 볼 수 있다. ``` kubectl exec dapi-envars-fieldref -- env```
    ![kubectl_exec_env.png](img/kubectl_exec_env.png) 
    
2. 컨테이너의 필드를 환경변수로 노출
```yaml
apiVersion: v1
kind: Pod
metadata:
  name: dapi-envars-resourcefieldref
spec:
  containers:
    - name: test-container
      image: k8s.gcr.io/busybox:1.24
      command: [ "sh", "-c"]
      args:
      - while true; do
          echo -en '\n';
          printenv MY_CPU_REQUEST MY_CPU_LIMIT;
          printenv MY_MEM_REQUEST MY_MEM_LIMIT;
          sleep 10;
        done;
      resources:
        requests:
          memory: "32Mi"
          cpu: "125m"
        limits:
          memory: "64Mi"
          cpu: "250m"
      env:
        - name: MY_CPU_REQUEST
          valueFrom:
            resourceFieldRef:
              containerName: test-container
              resource: requests.cpu
        - name: MY_CPU_LIMIT
          valueFrom:
            resourceFieldRef:
              containerName: test-container
              resource: limits.cpu
        - name: MY_MEM_REQUEST
          valueFrom:
            resourceFieldRef:
              containerName: test-container
              resource: requests.memory
        - name: MY_MEM_LIMIT
          valueFrom:
            resourceFieldRef:
              containerName: test-container
              resource: limits.memory
  restartPolicy: Never
```

### downwardAPI 볼륨에 파일로 메타데이타 전달
위의 예시 처럼 환경변수 대신, 파일로 메타데이터를 노출 할 수도 있다. downwardAPI 볼륨을 정의하고, 컨테이너에 마운트하면 가능하다.  
1. 파드 필드 저장하기

    ```yaml
    apiVersion: v1
    kind: Pod
    metadata:
      name: kubernetes-downwardapi-volume-example
      labels:
        zone: us-est-coast
        cluster: test-cluster1
        rack: rack-22
      annotations:
        build: two
        builder: john-doe
    spec:
      containers:
        - name: client-container
          image: k8s.gcr.io/busybox
          command: ["sh", "-c"]
          args:
            - while true; do
              if [[ -e /etc/podinfo/labels ]]; then
              echo -en '\n\n'; cat /etc/podinfo/labels; fi;
              if [[ -e /etc/podinfo/annotations ]]; then
              echo -en '\n\n'; cat /etc/podinfo/annotations; fi;
              sleep 5;
              done;
          volumeMounts:
            - name: podinfo
              mountPath: /etc/podinfo
      volumes:
        - name: podinfo
          downwardAPI:
            items:
              - path: "labels"
                fieldRef:
                  fieldPath: metadata.labels
              - path: "annotations"
                fieldRef:
                  fieldPath: metadata.annotations
    
    ```
    * downwardAPI 하위의 배열 요소는 DownwardAPIVolumeFile이다.
        - https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.22/#downwardapivolumefile-v1-core
        - DownwardAPIVolumeFile : 파드의 필드를 포함하고 있는 파일을 생성하는 정보를 담고 있다.
       
        - ```kubectl create``` vs ```kubectl apply``` https://stackoverflow.com/questions/47369351/kubectl-apply-vs-kubectl-create
        
        ![volume_ls_lL.png](img/volume_ls_lL.png) 
        
        ![volume_ls_laR.png](img/volume_ls_laR.png) 
        - 임시 하위 디렉토리에 label, annotations 파일이 있고, /etc/podinfo 디렉토리에서 심볼릭 링크로 연결되어 있다. 
          업데이트가 일어나면, 새 임시 디렉토리에 기록되고, 심볼링 링크가 갱신한다. 
          
2. 컨테이너 정보 저장하기 
  - 컨테이너 수준의 메타데이터를 노출할때에는 리소스 필드를 참조하는 컨테이너 이름을 지정해야 한다.
  - 볼륨을 사용하는 경우, 환경변수를 사용하는 것보다 더 복잡하지만, 필요한 경우 한 컨테이너의 리소스 필드를 다른 컨테이너에 전달 할 수 있다. (동일 파드 안에 있어야함)
    ```yaml
    apiVersion: v1
    kind: Pod
    metadata:
      name: kubernetes-downwardapi-volume-example-2
    spec:
      containers:
        - name: client-container
          image: k8s.gcr.io/busybox:1.24
          command: ["sh", "-c"]
          args:
            - while true; do
              echo -en '\n';
              if [[ -e /etc/podinfo/cpu_limit ]]; then
              echo -en '\n'; cat /etc/podinfo/cpu_limit; fi;
              if [[ -e /etc/podinfo/cpu_request ]]; then
              echo -en '\n'; cat /etc/podinfo/cpu_request; fi;
              if [[ -e /etc/podinfo/mem_limit ]]; then
              echo -en '\n'; cat /etc/podinfo/mem_limit; fi;
              if [[ -e /etc/podinfo/mem_request ]]; then
              echo -en '\n'; cat /etc/podinfo/mem_request; fi;
              sleep 5;
              done;
          resources:
            requests:
              memory: "32Mi"
              cpu: "125m"
            limits:
              memory: "64Mi"
              cpu: "250m"
          volumeMounts:
            - name: podinfo
              mountPath: /etc/podinfo
      volumes:
        - name: podinfo
          downwardAPI:
            items:
              - path: "cpu_limit"
                resourceFieldRef:
                  containerName: client-container
                  resource: limits.cpu
                  divisor: 1m
              - path: "cpu_request"
                resourceFieldRef:
                  containerName: client-container
                  resource: requests.cpu
                  divisor: 1m
              - path: "mem_limit"
                resourceFieldRef:
                  containerName: client-container
                  resource: limits.memory
                  divisor: 1Mi
              - path: "mem_request"
                resourceFieldRef:
                  containerName: client-container
                  resource: requests.memory
                  divisor: 1Mi
    ```    
    
## 쿠버네티스 API 서버와 통신하기
downward API를 사용하면 파드/컨테이너의 메타디어터를 그 안에서 실행되는 프로세스로 쉽게 전달 할 수 있는데, 대신 사용 가능한 메타데이터가 한정적이다. 
애플리케이션이 다른 리소스의 정보/최신 데이터에 접근해야하는 경우 API 서버와 직접 통신해야한다. 

![API_SERVER.png](img/API_SERVER.png) 

1. API 서버에 접속하는 방법 - proxy로 서버와 통신하기 
```kubernetes 
    kubectl proxy --port=8080
    curl localhost:8080/apis/batch
```
--port 옵션을 사용하면 임의로 포트를 정할 수 있다. 

![kubetcl_proxy.png](img/kubetcl_proxy.png) 
![api_server_response.png](img/api_server_response.png) 
![apis_batch.png](img/apis_batch.png) 


2. 파드 내에서 API 서버와 통신
    - API 서버의 위 찾기치
        - 서버 주소 찾기
        ```kubernetes
            kubectl get svc
        ``` 
        ![kubectl_get_svc.png](img/kubectl_get_svc.png) 
        ```kubernetes
             kubectl exec -it curl -- sh
             env
        ``` 
        ![env_in_pod.png](img/env_in_pod.png) 
        
        - 서버 아이덴티티검증
            - 인증서와 토큰을 사용하여 API접속
            ```kubernetes
              # Point to the internal API server hostname
              APISERVER=https://kubernetes.default.svc
              
              # Path to ServiceAccount token
              SERVICEACCOUNT=/var/run/secrets/kubernetes.io/serviceaccount
              
              # Read this Pod's namespace
              NAMESPACE=$(cat ${SERVICEACCOUNT}/namespace)
              
              # Read the ServiceAccount bearer token
              TOKEN=$(cat ${SERVICEACCOUNT}/token)
              
              # Reference the internal certificate authority (CA)
              CACERT=${SERVICEACCOUNT}/ca.crt
              
              # Explore the API with TOKEN
              curl --cacert ${CACERT} --header "Authorization: Bearer ${TOKEN}" -X GET ${APISERVER}/api
            ```
           ![access_api_server_wo_proxy.png](img/access_api_server_wo_proxy.png) 

         
    - API 서버와 통신하고 있는지 확인
    - API 서버로 인증 
