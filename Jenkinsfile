pipeline {
    agent any
    tools {
    	maven 'Maven 3'
    }
    stages {
    	stage('Initialize') {
    		steps {
    			sh '''
    				echo "PATH = ${PATH}"
    				echo "M2_HOME = ${M2_HOME}"
    			'''
    		}
    	}
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
    }
}