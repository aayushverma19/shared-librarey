@Library('ninja@main') _

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                    // Call the helloWorld script from the Shared Library
                    helloWorld('Jenkins')
                }
            }
        }
    }
}
