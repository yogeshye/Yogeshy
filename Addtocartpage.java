package softwaretesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Addtocartpage extends Basepage {

	public Addtocartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By homenav = By.xpath("//a[@data-test='nav-home']");
	private By selecttedproduct = By.xpath("//h5[@data-test='product-name']");
	private By cartaddbutton = By.id("btn-add-to-cart");
	private By carlabelbutton = By.id("lblCartCount");
	private By cartcountbutton = By.xpath("/html/body/app-root/div[2]/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/table/tbody/tr/td[1]/span");
  
	 //after log in go back to the home page
	public void gohome() {
        wait.until(ExpectedConditions.elementToBeClickable(homenav)).click();

	}
	
       // get first product title		
	public String getfirstproducttitletext() {
		// navigate to the home page
         //wait and select for the product 
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(selecttedproduct));
      return  wait.until(ExpectedConditions.visibilityOfElementLocated(selecttedproduct)).getText().trim();
	}
		
	// add that product into the cart
	public void addproductcart() {	
		wait.until(ExpectedConditions.elementToBeClickable(selecttedproduct)).click();
		//click add to cart 
	    wait.until(ExpectedConditions.elementToBeClickable(cartaddbutton)).click();
	}	    
	  
	//got to  the cart
    public void gotocart() {
	    wait.until(ExpectedConditions.elementToBeClickable(carlabelbutton)).click();    
 	    
	
   }
    
    //look for the same product in the cart
    public String cartcount() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(cartcountbutton)).getText().trim();

    }
	}
 
	

