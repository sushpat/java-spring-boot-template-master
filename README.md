# java-spring-boot-template
<pre>This repo is the template for java, spring boot based application which can be deployed and devops can be achieved using openshift, kubernetes and jenkins

For Openshift:
To use this, we need oc client to be downloaded and instaled in our local system.
Please follow the url for more steps  https://blog.openshift.com/installing-oc-tools-windows/

deployment_service_route.yaml - 
		This file contains diffrent operators like deployment config, service and route.
		Deploymentconfig - will help our application to deploy.
		Service -  this will or application to expose to outside
		route - this will help to access the application based on service.
build_image-docker.yaml - 
		This file contains diffrent operators like buildconfig, imege stream and buildconfig for jenkinspipline. with this we can build the image from dockerfile.
		
build_image-s2i.yaml 
		With this we can build our image thorugh s2i without having any docker file.

Jenkinsfile
		With this file we can build and create an image outour code without any docker file.

Jenkinsfile_unit_sonar
		With this we can run the unit test, sonar and build an image with docker file  and also, without docker file. 
		while using this just rename this as jenkinsfile.

Webhooks - 
	1.<OPENSHIFTURL>(https://master.caas.rd.corpintra.net)/oapi/v1/namespaces/<NAMESPACE>(pdm2020-test)/buildconfigs/<APPNAME>(vr4-pdm2020-bootstrap-test)/webhooks/98ef7c6f96C79c9f/github  - fill the blank values.
	2. Go to GIT repo settings -> hooks -> addwebhook.
	3. Fill the Payload URL ( <OPENSHIFTURL>/oapi/v1/namespaces/<NAMESPACE>/buildconfigs/<APPNAME>/webhooks/98ef7c6f96C79c9f/github), Content type to application/json and finally add webhooks.


	
Steps to use this:
	1. Create a repo in git or bitbucket.
	2. Upload code along with with jenkins file.
	3. Run the build config (with the values from bootstrap.bat file) after filling all the neccry values like repo name, branch name etc.  This will create a jobs in jenkins, build job and pipline in openshift.
	4. Run the deployment_service_route.yaml (with the values from application.bat file) after filling neccery values this will create a deployment job, service and route to access the application outside.

Steps to build the application:
	1.Install Maven in your local.
	2.Run the command `mvn clean install` (from the project direcoty, where pom file is present) to install all the dependencies and to build the jar file of the application.
	3.Use command `mvn spring-boot:run` to run the application , from home folder of the project.
	</pre>


