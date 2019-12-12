package unit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class LeonTest {

    public void aTest1(){
        System.out.println("This is test 1");
    }

    public void bTest1(){
        System.out.println("This is test 2");
    }
    public void cTest1(){
        SoftAssert sa = new SoftAssert();
        System.out.println("This is test 3");
        sa.fail();
    }
}
