package Testingpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import softwaretesting.Addtocartpage;
import softwaretesting.Loginpage;

public class AddtocartTest extends BaseTest {
  
	@Test(enabled = false)
	public void addtocart() {
	    Loginpage loginPage = new Loginpage(driver);
        loginPage.clicklogin();
        loginPage.login("customer@practicesoftwaretesting.com", "welcome01");
		Addtocartpage addtocartpage = new Addtocartpage(driver);
		addtocartpage.gohome();
		String Expectedproduct = addtocartpage.getfirstproducttitletext();
		addtocartpage.addproductcart();
		addtocartpage.gotocart();
		String Actualproduct = addtocartpage.cartcount();
		Assert.assertEquals(Actualproduct,Expectedproduct,"The product added to cart");
 	}
	
	
	
}
