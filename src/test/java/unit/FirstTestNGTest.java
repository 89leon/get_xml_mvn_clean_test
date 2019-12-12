package unit;

import app.UserManager;
import baseclasses.UnitTestBaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGTest extends UnitTestBaseClass {

    UserManager um;

    @BeforeMethod
    public void customLocalSetupMethod(){
        um = new UserManager();
    }

    @Test
    public void successfulAddUserReturnsTrue(){
        // Arrange


        // Act
        boolean result = um.addUser("89leon@gmail.com");

        // Assert
        //Assert.assertEquals(result,"89leon@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void getExistingUserReturnsExistingSavedUser(){
        // Arrange
        um.addUser("89leon@gmail.com");

        // Act
        String user = um.getUser("89leon@gmail.com");

        // Assert
        Assert.assertEquals(user, "89leon@gmail.com");
    }

    @Test
    public void getNonExistingUserReturnsNull(){
        // Arrange

        // Act
        String user = um.getUser("89leon@gmail.com");

        // Assert
        Assert.assertNull(user,"The method should return null if it doesn't find a user");
    }
}
