podTemplate(yaml: """
apiVersion: v1
kind: Pod
metadata:
  labels:
    some-label: builder
spec:
  containers:
  - name: builder
    image: adoptopenjdk/openjdk11
    command:
    - cat
    tty: true
"""
  ) {

  node(POD_LABEL) {
    stage('Build and test') {
    checkout scm
      container('builder') {
        sh 'chmod 777 mvnw'
//         sh './mvnw clean install -B -U'
//         sh 'echo BOBBY WASHINGTON'
//         sh 'docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres'
      }
    }
  }
}
