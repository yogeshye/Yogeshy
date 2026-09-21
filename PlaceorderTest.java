package Testingpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import softwaretesting.Addtocartpage;
import softwaretesting.Loginpage;
import softwaretesting.Placeorderpage;

public class PlaceorderTest extends BaseTest{

	
	@Test
	public void placeorder() {
		 //user logs in 
		  Loginpage loginPage = new Loginpage(driver);
	        loginPage.clicklogin();
	        loginPage.login("Yyedhe12@gmail.com", "Yogeshyedhe@123");
            Placeorderpage orderpage = new Placeorderpage(driver);
            orderpage.gohome();
			Addtocartpage addtocartpage = new Addtocartpage(driver);
			addtocartpage.addproductcart();
			addtocartpage.gotocart();
			orderpage.proceedtocheckout1();
            orderpage.fillinaddress();
            orderpage.fillinbillingaddresss();
            orderpage.paymentviacashondelivery();
            String Actualmessage = orderpage.paymentsuccessfullmessage();
            String expectedMessage = "Payment was successful";
            Assert.assertEquals(Actualmessage, expectedMessage, "The expected banner did not match the UI text");

	}
	
}
