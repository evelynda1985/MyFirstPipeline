

pipeline {
  agent any
  stages {
    stage('clean') {
    environment{
    FOO ='C:/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin/mvn clean'
    }
      steps {
          echo "hello==================>"
          bat '%FOO%'
      }
    }

  }
}

environment{
    MAVEN_HOME = 'C:/apache-maven-3.6.3-bin/apache-maven-3.6.3'
    MAVEN_BIN = '$MAVEN_HOME/bin'
}

