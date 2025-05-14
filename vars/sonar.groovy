def call()
        stage('sonar'){
            steps{
                sh "mvn clean package sonar:sonar"
            }
        }
