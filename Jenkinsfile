pipeline{
    agent any
    tools{
        maven "Maven"
    }
    stages{
    stage('checkout'){
        steps{
            checkout scm
        }
    }
    stage('Build'){
        steps{
        sh "mvn install"
        }
    }
    stage('Unit test'){
        steps{
        sh "mvn test"
        }
    }
    stage('Sonar Analysis'){
        tools {
            jdk "jdk17"
        }
        steps{
            withSonarQubeEnv(installationName: 'Test_Sonar')
            {
                sh "mvn clean test sonar:sonar"
            }
        }
    }
    stage("Quality Gate") {
        steps {
            def qg = waitForQualityGate()
            echo qg
//             timeout(time: 5, unit: 'MINUTES') {
//                 // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
//                 // true = set pipeline to UNSTABLE, false = don't
//                 waitForQualityGate abortPipeline: true
//             }
        }
    }
    }
    post{
        success{
            sh "echo success"
        }
    }
}
