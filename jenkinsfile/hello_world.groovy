def environment = "${params.environment}"
def test_file = "${params.test_file}"
pipeline {
    agent any
    stages {
        stage('Hello World!') {
            steps {
                echo "Hello World!"
            }
        }
        stage('Get Input Parameters..') {
            steps {
                echo "Environment : ${env}"
                echo "Test File : ${test_file}"
            }
        }
        stage('Print the contents of the Test File..') {
            steps {
                sh "cat ${test_file}"
            }
        }
    }
    post {
        always {
            echo "This message is posted ALWAYS."
        }
        failure {
            echo '*${currentBuild.fullDisplayName}* failed. Refer details at ${BUILD_URL}. Job Duration: *${currentBuild.durationString}*.'
        }
        success {
            echo '*${currentBuild.fullDisplayName}* completed successfully. Refer details at ${BUILD_URL}. Job Duration: *${currentBuild.durationString}*.'
        }
    }
}
