pipeline{
    agent any
        tools {
        maven 'maven_3_8_1'
        jdk 'Java_14'
     
    }
    stages{
        stage("Git Checkout"){
            steps{
                 git 'https://github.com/RVAnvil/EmployeeManagement.git'
            }
        }
     stage ('Build') {
            steps {
                bat 'mvn clean install' 
            }
        }
    }
}
