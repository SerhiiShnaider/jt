node {

   stage('Cloning') {
        echo 'Project is cloning...'
        git 'https://github.com/SerhiiShnaider/jt.git'

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