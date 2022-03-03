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
//     stage('Unit test'){
//         steps{
//         sh "mvn test"
//         }
//     }
//     stage('Sonar Analysis'){
//         tools {
//             jdk "jdk17"
//         }
//         steps{
//             withSonarQubeEnv(installationName: 'Test_Sonar')
//             {
//                    sh 'mvn clean package sonar:sonar'
                    
// //                 sh 'mvn clean package org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.1.2184:sonar -Dsonar.exclusions=**/*.java'
//             }
//         }
//     }
//     stage("Quality Gate") {
//             steps {
//                     sleep 10
//                     timeout(time: 1, unit: 'HOURS') {
//                     waitForQualityGate abortPipeline: true
//                 }
//             }
//     }
//     stage('Creating an Artifactory Server Instance'){
//             steps{
//                 rtMavenResolver (
//                     id: 'resolver-unique-id',
//                     serverId: 'artifactory-server',
//                     releaseRepo: 'nagp-libs-release',
//                     snapshotRepo: 'nagp-libs-snapshot'
//                     )  
//                 rtMavenDeployer (
//                     id: 'deployer-unique-id',
//                     serverId: 'artifactory-server',
//                     releaseRepo: 'nagp-libs-release',
//                     snapshotRepo: 'nagp-libs-snapshot'
//                     )
//                 }
//            }
//    stage('Upload to Artifactory'){
//        steps{
//            rtMavenRun(
//                 pom: 'pom.xml',
//                 goals: 'clean install',
//                 resolverId: 'resolver-unique-id',
//                 deployerId: 'deployer-unique-id'
//            )
//            rtPublishBuildInfo(
//                 serverId: 'artifactory-server'
//            )
//        }
//        }
    }
    post{
        success{
            sh "echo success"
        }
    }
}
