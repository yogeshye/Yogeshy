package Testingpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import softwaretesting.Loginpage;

public class LoginTest extends BaseTest {
 	
    
	  @Test(enabled =false)
	    public void testValidLogin() {
	        Loginpage loginPage = new Loginpage(driver);
	        loginPage.clicklogin();
	        loginPage.login("yyedhe12@gmail.com", "Yogesye@123");
            boolean isloginvalid =  loginPage.isuserloogedin("Yogesh y");
            Assert.assertTrue(isloginvalid, "username match failed. user might not be logged in");
 	 
	    }
   
	 
}
