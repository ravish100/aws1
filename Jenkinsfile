pipeline {
    agent any
    tools {
        maven "maven-3.6.3"
    }
    stages {
        stage('Clean and Install') {
            steps {
               bat 'mvn clean install'
            }
        }
       
         stage('Run') {
            steps {
                dir ("https://github.com/ravish100/aws1/tree/master/target"){
               bat 'java -jar demo-0.0.1-SNAPSHOT.jar'
                    
                }
            }
        } 
    }
}
