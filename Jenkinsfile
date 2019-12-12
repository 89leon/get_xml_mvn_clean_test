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
        sh 'echo 1'
        def results = new XmlSlurper().parseText('<root><one a1="uno!"/><two>Some text!</two></root>')
        sh 'echo 2'
            
               


    } catch (Exception e){
            println "error" + e
    }

sh 'echo 4'
return "asd"
}