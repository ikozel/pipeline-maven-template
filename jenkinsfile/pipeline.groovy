node {
        stage('Checkout') {
                checkout scm
        }
        stage('Build') {
                sh '~/workspace/apache-maven-3.5.0/bin/mvn clean compile'
        }
        stage('Test') {
                sh '~/workspace/apache-maven-3.5.0/bin/mvn test'
        }
        stage('Package') {
                sh '~/workspace/apache-maven-3.5.0/bin/mvn package'
        }
}
