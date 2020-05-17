	In this repo we have the following files. these files can be used to deploy an application in k8s by just adding the name of the app, namespace in which namespace we would like to deploy the app, image name with complete repo and finally DNS host name.
	`{app-name}` - Replace this placeholder with application name.
	
	`{name-space}` - Replace this placeholder with namespace.
	
	`{DNShost name}` - Replace this placeholder with host name in ingress file

`kubectl apply -f 01_deploy.yaml`

`kubectl apply -f 02_service.yml`

`kubectl apply -f 03_Ingress.yml`

`kubectl apply -f 04_network-policy.yaml`
