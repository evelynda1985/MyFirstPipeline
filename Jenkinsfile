pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('build') {
                    steps {
                        bat 'mvn compile'
                    }
                }
    }
}