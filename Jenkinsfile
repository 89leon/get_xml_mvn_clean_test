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
@NonCPS
private def countResults(){
    def total = 0
    def failures = 0
    def skipped = 0
    def pass = 0

    try {
         sh 'echo 1'
       // dir("${dirOfSuite}"){
            //def files = findFiles(glob: '*.xml')
           //if (files != null){
                //def fileName = files[0].toString()
               // def xmlFile = readFile fileName
                sh 'echo 2'
                def results = new XmlSlurper().parseText('<root><one a1="uno!"/><two>Some text!</two></root>')
                 sh 'echo 3'
            
               


    } catch (Exception e){
            println "error" + e
    }

sh 'echo 4'
return "asd"
}