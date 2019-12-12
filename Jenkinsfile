node {
    stage('Build') {
        cleanWs()
       sh '''
            
            git clone 'https://github.com/89leon/get_xml_mvn_clean_test.git'
            pwd
            ls
            cd ./get_xml_mvn_clean_test
            mvn clean test
            ls
            cd target/surefire-reports
            ls



       '''
        countResults()
    }
    stage('Test') {
        echo 'Testing....'
    }
  
}

private def countResults(){
    def total = 0
    def failures = 0
    def skipped = 0
    def pass = 0

    try {
     
        
       def rootNode = new XmlSlurper().parseText('<testng-results ignored="0" total="6" passed="5" failed="1" skipped="0">')
            total = rootNode.attributes().
               


    } catch (Exception e){
            println "error" + e
    }

sh 'echo 4'
return "asd"
}