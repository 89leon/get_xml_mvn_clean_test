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




       '''
    }
    stage('Test') {
        echo 'Testing....'
    }
  
}

private def countResults(String dirOfSuite, def resultMap){
    def total = 0
    def failures = 0
    def skipped = 0
    def pass = 0

    try {

        dir("${dirOfSuite}"){
            def files = findFiles(glob: '*.xml')
            if (files != null){
                def fileName = files[0].toString()
                def xmlFile = readFile fileName
                def results = new XmlSlurper().parseText(xmlFile)
          //  }
        }

    } catch (Exception e){

    }



}