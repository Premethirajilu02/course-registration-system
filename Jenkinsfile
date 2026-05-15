pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/Premethirajilu02/course-registration-system.git'
            }
        }

        stage('Build Backend') {
            steps {
                dir('backend') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t course-registration-api .'
            }
        }

        stage('Run Container') {
            steps {
                sh '''
                docker stop course-app || true
                docker rm course-app || true
                docker run -d -p 8081:8080 --name course-app course-registration-api
                '''
            }
        }
    }
}