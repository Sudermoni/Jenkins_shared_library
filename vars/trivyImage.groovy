def call() {
    sh 'trivy image suderdocker/youtube:latest > trivyimage.txt'
}
