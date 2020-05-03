podTemplate(containers: [
    containerTemplate(name: 'builder', image: 'adoptopenjdk/openjdk11', ttyEnabled: true, command: 'cat'),
    containerTemplate(name: 'db', image: 'postgres', args: --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres ,ttyEnabled: true, command: 'cat')]
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
}
