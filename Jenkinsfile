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
       // dir("${dirOfSuite}"){
            //def files = findFiles(glob: '*.xml')
           //if (files != null){
                //def fileName = files[0].toString()
               // def xmlFile = readFile fileName
                sh 'echo 2'
                def results = new XmlSlurper().parseText('''
                <?xml version="1.0" encoding="UTF-8"?>
<testng-results ignored="0" total="6" passed="5" failed="1" skipped="0">
  <reporter-output>
  </reporter-output>
  <suite started-at="2019-12-12T09:13:55Z" name="Command line suite" finished-at="2019-12-12T09:13:55Z" duration-ms="19">
    <groups>
    </groups>
    <test started-at="2019-12-12T09:13:55Z" name="Command line test" finished-at="2019-12-12T09:13:55Z" duration-ms="19">
      <class name="unit.LeonTest">
        <test-method signature="aTest1()[pri:0, instance:unit.LeonTest@32709393]" started-at="2019-12-12T09:13:55Z" name="aTest1" finished-at="2019-12-12T09:13:55Z" duration-ms="1" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- aTest1 -->
        <test-method signature="bTest1()[pri:0, instance:unit.LeonTest@32709393]" started-at="2019-12-12T09:13:55Z" name="bTest1" finished-at="2019-12-12T09:13:55Z" duration-ms="0" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- bTest1 -->
        <test-method signature="cTest1()[pri:0, instance:unit.LeonTest@32709393]" started-at="2019-12-12T09:13:55Z" name="cTest1" finished-at="2019-12-12T09:13:55Z" duration-ms="1" status="FAIL">
          <exception class="java.lang.AssertionError">
            <message>
              <![CDATA[null]]>
            </message>
            <full-stacktrace>
              <![CDATA[java.lang.AssertionError: null
at org.testng.Assert.fail(Assert.java:96)
at org.testng.Assert.fail(Assert.java:103)
at unit.LeonTest.cTest1(LeonTest.java:17)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base/java.lang.reflect.Method.invoke(Method.java:566)
at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)
at org.testng.internal.Invoker.invokeMethod(Invoker.java:583)
at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)
at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)
at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)
at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)
at org.testng.TestRunner.privateRun(TestRunner.java:648)
at org.testng.TestRunner.run(TestRunner.java:505)
at org.testng.SuiteRunner.runTest(SuiteRunner.java:455)
at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)
at org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)
at org.testng.SuiteRunner.run(SuiteRunner.java:364)
at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)
at org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)
at org.testng.TestNG.runSuitesLocally(TestNG.java:1137)
at org.testng.TestNG.runSuites(TestNG.java:1049)
at org.testng.TestNG.run(TestNG.java:1017)
at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:77)
at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeMulti(TestNGDirectoryTestSuite.java:159)
at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:99)
at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:106)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base/java.lang.reflect.Method.invoke(Method.java:566)
at org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)
at org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)
at org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)
at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)
at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)
]]>
            </full-stacktrace>
          </exception> <!-- java.lang.AssertionError -->
          <reporter-output>
          </reporter-output>
        </test-method> <!-- cTest1 -->
      </class> <!-- unit.LeonTest -->
      <class name="unit.FirstTestNGTest">
        <test-method is-config="true" signature="globalSetup()[pri:0, instance:unit.FirstTestNGTest@3cef309d]" started-at="2019-12-12T09:13:55Z" name="globalSetup" finished-at="2019-12-12T09:13:55Z" duration-ms="5" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- globalSetup -->
        <test-method is-config="true" signature="globalBeforeMethodSetup()[pri:0, instance:unit.FirstTestNGTest@3cef309d]" started-at="2019-12-12T09:13:55Z" name="globalBeforeMethodSetup" finished-at="2019-12-12T09:13:55Z" duration-ms="0" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- globalBeforeMethodSetup -->
        <test-method is-config="true" signature="customLocalSetupMethod()[pri:0, instance:unit.FirstTestNGTest@3cef309d]" started-at="2019-12-12T09:13:55Z" name="customLocalSetupMethod" finished-at="2019-12-12T09:13:55Z" duration-ms="1" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- customLocalSetupMethod -->
        <test-method is-config="true" signature="customLocalSetupMethod()[pri:0, instance:unit.FirstTestNGTest@3cef309d]" started-at="2019-12-12T09:13:55Z" name="customLocalSetupMethod" finished-at="2019-12-12T09:13:55Z" duration-ms="1" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- customLocalSetupMethod -->
        <test-method signature="getExistingUserReturnsExistingSavedUser()[pri:0, instance:unit.FirstTestNGTest@3cef309d]" started-at="2019-12-12T09:13:55Z" name="getExistingUserReturnsExistingSavedUser" finished-at="2019-12-12T09:13:55Z" duration-ms="0" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- getExistingUserReturnsExistingSavedUser -->
        <test-method is-config="true" signature="globalBeforeMethodSetup()[pri:0, instance:unit.FirstTestNGTest@3cef309d]" started-at="2019-12-12T09:13:55Z" name="globalBeforeMethodSetup" finished-at="2019-12-12T09:13:55Z" duration-ms="0" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- globalBeforeMethodSetup -->
        <test-method signature="getNonExistingUserReturnsNull()[pri:0, instance:unit.FirstTestNGTest@3cef309d]" started-at="2019-12-12T09:13:55Z" name="getNonExistingUserReturnsNull" finished-at="2019-12-12T09:13:55Z" duration-ms="0" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- getNonExistingUserReturnsNull -->
        <test-method is-config="true" signature="customLocalSetupMethod()[pri:0, instance:unit.FirstTestNGTest@3cef309d]" started-at="2019-12-12T09:13:55Z" name="customLocalSetupMethod" finished-at="2019-12-12T09:13:55Z" duration-ms="0" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- customLocalSetupMethod -->
        <test-method signature="successfulAddUserReturnsTrue()[pri:0, instance:unit.FirstTestNGTest@3cef309d]" started-at="2019-12-12T09:13:55Z" name="successfulAddUserReturnsTrue" finished-at="2019-12-12T09:13:55Z" duration-ms="0" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- successfulAddUserReturnsTrue -->
        <test-method is-config="true" signature="globalBeforeMethodSetup()[pri:0, instance:unit.FirstTestNGTest@3cef309d]" started-at="2019-12-12T09:13:55Z" name="globalBeforeMethodSetup" finished-at="2019-12-12T09:13:55Z" duration-ms="0" status="PASS">
          <reporter-output>
          </reporter-output>
        </test-method> <!-- globalBeforeMethodSetup -->
      </class> <!-- unit.FirstTestNGTest -->
    </test> <!-- Command line test -->
  </suite> <!-- Command line suite -->
</testng-results>

                
                ''')
                 sh 'echo 3'
                sh 'echo "${results}"'
                if (results != null){
                    println "asd"
                    sh 'echo 123'
                }
                else {
                    println "its null"
                    sh 'echo 456'
                }
          //  }
      //  }

    } catch (Exception e){

    }



}