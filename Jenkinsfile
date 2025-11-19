pipeline{
  agent any
  tools{
    maven 'devops_maven'
  }
  triggers{
    githubPush()
  }
  environment{
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
        sh 'mvn -f $POM -B package'
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
    stage('Empaquetado'){
      steps{
        archiveArtifacts artifacts: 'jugandoArreglos/target/*.jar', fingerprint:true
      }
    }
  }
}
