node {
    stage('Build') {
       sh '''
            
            git  'https://github.com/89leon/get_xml_mvn_clean_test.git'
            pwd
            mvn clean test
           


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
            
        }

    } catch (Exception e){

    }



}