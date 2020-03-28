pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        withMaven(maven: 'apache-maven-3.6.1') {
          bat 'mvn clean compile'
        }

      }
    }

    stage('build') {
      steps {
        withMaven(maven: 'apache-maven-3.6.1') {
          bat 'mvn clean compile'
        }

      }
    }

  }
}