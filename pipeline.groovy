pipeline {
    agent any

    tools {
        maven 'Maven_3.8.5' // Ensure this matches your configured Maven tool name
        jdk 'JDK_21'        // Ensure this matches your configured JDK tool name
    }

    stages {
        stage('Get Code') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/ToubaSlam/MarketCrunchAI_Task', branch: 'master'
            }
        }

        // Optional: Add a stage to start your local application if needed.
        // stage('Start Application') {
        //     steps {
        //         // Add commands to start your backend service
        //     }
        // }

        stage('Build & Test') {
            steps {
                bat 'mvn clean verify'
            }
        }
    }

    post {
        always {
            allure includeProperties: false, jdk: 'JDK_21', results: [[path: 'target/allure-results']]
        }
    }
}
