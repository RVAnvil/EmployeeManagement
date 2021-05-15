pipeline{
    agent any
        tools {
        maven 'maven_3_8_1'
        jdk 'JDK_9_0_4'
        
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
