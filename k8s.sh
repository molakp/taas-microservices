# ------------------  DISCOVERY-SERVICE ------------------

#Cancello risorse esistenti dal cluster kubernetes
kubectl delete -n default deployment discovery-server
kubectl delete -n default service discovery-server
kubectl delete -n default service discovery-server-external
kubectl delete -n default service discovery-server-internal


#Creo risorse nel cluster kubernetes
kubectl apply -f ./kubernetes/eureka-deployment.yaml
#Espongo il servizio discovery-server
kubectl expose deployment/discovery-server --type=LoadBalancer --port 8761 --target-port 8761

# ------------------  API-SERVICE ------------------
#Cancello risorse esistenti dal cluster kubernetes
kubectl delete -n default deployment api-service
kubectl delete -n default service api-service
kubectl apply -f ./kubernetes/api-service-deployment.yaml
kubectl rollout restart deployment api-service




# ------------------ GATEWAY-SERVICE ------------------
#Cancello risorse esistenti dal cluster kubernetes
kubectl delete -n default deployment gateway
kubectl delete -n default service gateway
kubectl delete -n default service gateway-external
kubectl delete -n default service gateway-internal
#Creo risorse nel cluster kubernetes
kubectl apply -f ./kubernetes/gateway-deployment.yaml
#Espongo il servizio gateway
kubectl expose deployment/gateway  --type=LoadBalancer --port 9191 --target-port 9191

# ------------------  POSITION-SERVICE ------------------
#Cancello risorse esistenti dal cluster kubernetes
kubectl delete -n default deployment position-service
kubectl delete -n default service position-service
kubectl delete -n default service position-service-external
kubectl delete -n default service position-service-internal
#Creo risorse nel cluster kubernetes
kubectl apply -f ./kubernetes/position-deployment.yaml

