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
  - name: db
    image: postgres
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
          sh 'echo BOBBY WASHINGTON'
          //         sh './mvnw clean install -B -U'
    }
  }
}
