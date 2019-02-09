node {

   stage('Cloning') {
        echo 'Project is cloning...'
        git 'https://github.com/jglick/simple-maven-project-with-tests.git'

   }
   stage('Build') {
      echo 'Project is building...'
      if (isUnix()) {
        echo 'UNIX !!!'
      } else {
         bat 'mvn clean compile'
      }
   }
   stage('Test') {
      echo 'Project is testing...'
      if (isUnix()) {
        echo 'UNIX !!!'
      } else {
         bat 'mvn test'
      }
   }
}