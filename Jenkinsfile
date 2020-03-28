

pipeline {
  agent any
  stages {
    stage('clean') {
    environment{
    MAVEN_HOME = 'C:/apache-maven-3.6.3-bin/apache-maven-3.6.3'
    MAVEN_BIN = '$MAVEN_HOME/bin'
    }
      steps {
          echo "hello==================>"
          bat '%MAVEN_BIN%/mvn clean'
      }
    }

  }
}

