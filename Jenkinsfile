pipeline{
  agent any
  tools{
    maven 'maven_devops'
  }
  triggers{
    githubPush()
  }
  enviroment{
      POM='jugandoArreglos/pom.xml'
  }
  stages{
    stages('Descarga'){
      steps{
        git url:'https://github.com/ragdenamor/JugarArreglos.git', branch:'main'
      }
    }
    stage('Compilacion'){
      steps{
        sh 'mvn -f $POM -B'
      }
    }
    stages('Prueba'){
      steps{
        sh 'mvn -f $POM test'
      }
      post{
        always{
          junit 'jugandoArreglos/target/surefire-reports/*.xml'
        }
      }
    }
    stage('empaquetado'){
      steps{
        archiveArtifacts artifacts: 'jugandoArreglos/target/*.jar', fingerprint: true
      }
    }
  }
}
