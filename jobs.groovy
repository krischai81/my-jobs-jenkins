pipeline {
  agent any
  stages {
    stage('Hi') {
      steps { echo "I was generated from git" }
    }
  }
  post {
    always {
      influxDbPublisher(selectedTarget: 'jenkins')
    }
  }
}
