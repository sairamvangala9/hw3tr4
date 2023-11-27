# swe645 Assignment 3
Authors:
```
Sayi Rosshhun Gadde (G#: G01383994)
Sai Ram Vangala (G#: G01373045)
```

AWS/Surveys API/Node URL: http://44.216.255.114:32298/api/surveys/ <br>
Jenkins URL: http://52.204.242.9:8080/job/swe645-a3/ <br>
Rancher URL: https://3.225.188.22/dashboard/home <br>

DockerHUB image: sairamvangala9/swe3<br>
Github repo: https://github.com/sairamvangala9/hw3tr4<br>

## Requirements and tools
Git and Github
<br>Docker and DockerHUB
<br>AWS account EC2, Elastic IP
<br>Jenkins
<br>Rancher
<br>Git
<br>Java SDK
<br>maven

## Installation or setup

1.Create 3 EC2 instances of Ubuntu server Latest LTS version with size at least t2.large and setup Elastic IPs for each of them to use them as <br>a.Rancher b.Node c.Jenkins <br>
2.Install docker engine on Rancher and Node instance using the steps in https://docs.docker.com/engine/install/.
3.Install Rancher on Rancher instance using docker
```commandline
$ sudo docker run --privileged -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:stable
```
3.Create a cluster. Copy the registration command checking Insecure option and run it on the 2nd EC2 instance i.e. Node. Wait till the cluster becomes active<br>
4.Download the kubeconfig file for this cluster<br>
5.In the top left corner, find the options button and click on it to find the cluster created then on click on the cluster<br>
6.Choose Workloads>>Deployments>>Create<br>
7.Give name for the deployment, replicas as 3, provide the docker hub container image name<br>
8.In the networking section add port of type Nodeport and provide a name and private container port as 8080<br> and the click on create
9.This creates a deployment with 3 pods and Provides Endpoints. Note the Port number provided in Endpoints<br>
10.In the inbound traffic rules for 3 instances allow "All traffic" and "Any IP4" service<br> 
11.Use the 2nd Instance "Node" address with port number noted in the previous step to access the webpage<br>
12.Install Jenkins, opensource Java-SDK, Docker, and Maven on the 3rd Instance ie. Jenkins instance, setup new password. Create credentials and save github and docker hub credentials
```
sudo apt install maven
```
13.Create a pipeline, check GitHub project and provide the URL for github project<br>
14.Check 'GitHub hook trigger for GITScm polling' option<br>
15.Under Pipeline section, choose Definition as 'Pipeline script from SCM', choose 'Git' as SCM, then provide github repo URL and select credentials, provide branch as main, Script path as Default 'Jenkinsfile' and then click on apply and save<br>
16.This creates the pipeline and can be triggered anytime by clicking on 'Build Now' option or whenever there is a change in the git repository

## Working
Rancher is used for Kubernetes management tool<br>
GitHub webhook is created to trigger Jenkins job<br>
Jenkins takes pipeline script from Github repo<br>
Github repo maintains cluser yaml file, Dockerfile, webpage code<br>
Whenever a new commit is pushed to the git repository, webhook hits Jenkins to trigger Jenkins job which makes the deployment<br>

## References
https://linuxize.com/post/how-to-install-jenkins-on-ubuntu-20-04/ <br>
https://www.youtube.com/watch?v=jF8jCg1WPwo <br>
https://www.youtube.com/watch?v=xlvSjDHvUwU <br>
https://www.youtube.com/watch?v=_MIssWPguZ0 <br>
