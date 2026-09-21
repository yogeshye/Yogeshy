package Testingpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import softwaretesting.Addtocartpage;
import softwaretesting.Loginpage;
import softwaretesting.filterproductpage;

public class FilterproductTest extends BaseTest {
	
	@Test(enabled =false)
	public void testsearchfunctionality() {
		Loginpage loginPage = new Loginpage(driver);
	    loginPage.clicklogin();
	    loginPage.login("customer@practicesoftwaretesting.com", "welcome01");
		filterproductpage filterproduct = new filterproductpage(driver);
		filterproduct.gohome();
		filterproduct.verifysearchfunction("hammer");
		boolean issearchresultappears = filterproduct.getsearchtitle("hammer");
 	    Assert.assertTrue(issearchresultappears, "Result did not match with the searchkey");
	   
 	}

}
