pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
          bat ${MAVEN_BIN}'/mvn clean'
      }
    }

  }
}

environment{
    MAVEN_HOME = 'C:/apache-maven-3.6.3-bin/apache-maven-3.6.3'
    MAVEN_BIN = '$MAVEN_HOME/bin'
}