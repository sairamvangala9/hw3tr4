pipeline {
    agent any
    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerhub_u_and_p')
    }
    stages {
        stage("build package") {
            steps {
                script {
                    checkout scm
                    sh "mvn clean package"
                }
            }
        }
        stage("Build image") {
            steps {
                script {
                    sh 'docker login -u $DOCKERHUB_CREDENTIALS_USR -p $DOCKERHUB_CREDENTIALS_PSW'
                    sh 'docker build -t sairamvangala9/swe3 .'
                }
            }
        }
        stage("Image push") {
            steps {
                script {
                    sh 'docker push sairamvangala9/swe3'
                }
            }
        }
        stage("Deploy") {
            steps {
                script {
                    sh 'cp cluster1.yaml ~/.kube/config'
                    sh 'kubectl config use-context cluster1'
                    sh 'kubectl scale deployment deployment1 --replicas=0'
                    sh 'kubectl scale deployment deployment1 --replicas=3'
                }
            }
        }
    }
}