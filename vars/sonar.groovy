def call() {
    stage('Sonar') {
        // Note: no "steps" block here in shared library functions
        sh "mvn clean package sonar:sonar"
    }
}
