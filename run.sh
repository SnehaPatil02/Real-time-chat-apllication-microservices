# Point your shell to Minikube's docker-daemon
eval $(minikube docker-env)

# Rebuild your images
 docker build -t messaging-service ./messagingservice
 docker build -t user-management-service ./usermanagement
