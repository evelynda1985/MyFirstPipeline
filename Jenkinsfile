pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
          echo "hello==================>"
          echo 'hello==================> $MAVEN_HOME'
      }
    }

  }
}

environment{
    MAVEN_HOME = 'C:/apache-maven-3.6.3-bin/apache-maven-3.6.3'
    MAVEN_BIN = '$MAVEN_HOME/bin'
}