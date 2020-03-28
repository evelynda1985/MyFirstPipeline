pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
          bat 'C:\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin\mvn clean'
      }
    }

    stage('compile') {
      steps {
          bat 'C:\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin\mvn compile'
      }
    }

    stage('test') {
      steps {
          bat 'C:\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin\mvn test'
      }
    }

  }
}