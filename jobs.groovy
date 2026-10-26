pipelineJob('hello-from-git') {
  definition {
    cps {
      script('''
        pipeline {
          agent any
          stages {
            stage('Hi') {
              steps { echo "generated from a git repo" }
            }
          }
        }
      ''')
      sandbox()
    }
  }
}
