pipeline {
  agent any
  environment{
      MAVEN_HOME='C:/apache-maven-3.6.3-bin/apache-maven-3.6.3'
      MAVEN_BIN='C:/apache-maven-3.6.3-bin/apache-maven-3.6.3/bin'
      }
  stages {
    stage('clean') {
      steps {
          bat '%MAVEN_BIN%/mvn clean'
      }
    }
     stage('compile') {
        steps {
           echo "hello==================>"
           bat '%MAVEN_BIN%/mvn -f C:/Users/evsanche/projects/MyFirstPipeline/pom.xml/mvn compile'
          }
        }

  }
}

