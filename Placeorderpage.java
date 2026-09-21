package softwaretesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Placeorderpage extends Basepage {
    
	private By homenav = By.xpath("//a[@data-test='nav-home']");
	private By checkout = By.cssSelector("button[data-test='proceed-1']");
	private By email = By.id("email");
	private By pass = By.id("password");
	private By login = By.xpath("//*[@id=\"signin-tab\"]/form/div[3]/input");
	private By checkout2 = By.cssSelector("button[data-test='proceed-2']");
	private By country = By.id("country"); 
	private By postalcode = By.id("postal_code");
	private By housernumber = By.id("house_number");
	private By street = By.id("street");
	private By city = By.id("city");
	private By state = By.id("state");
	private By checkout3 = By.cssSelector("button[data-test='proceed-3']");
	private By paymentdropdown = By.id("payment-method");
	private By paymentconfirmbutton = By.cssSelector("button[data-test='finish']");
	private By payementsuccessmessage = By.xpath("//div[@data-test='payment-success-message']");
	public Placeorderpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//naviate to homepage
	public void gohome() {
        wait.until(ExpectedConditions.elementToBeClickable(homenav)).click();

	}
	
	public void proceedtocheckout1() {
		wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();

	}
     
	public void fillinaddress() {
		if(!driver.findElements(email).isEmpty()) {
			wait.until(ExpectedConditions.elementToBeClickable(email)).sendKeys("yyedhe12@gmail.com");
			wait.until(ExpectedConditions.elementToBeClickable(pass)).sendKeys("Yogeshye@123");
			wait.until(ExpectedConditions.elementToBeClickable(login)).click();
		} else {
			// TODO: handle exception
			wait.until(ExpectedConditions.elementToBeClickable(checkout2)).click();

		}
		 
	}
	
	public void fillinbillingaddresss() {
		//select country name from dropdown
    	WebElement dropdownlocator = wait.until(ExpectedConditions.elementToBeClickable(country));
		Select dropdown = new Select(dropdownlocator);
		dropdown.selectByVisibleText("India");

		wait.until(ExpectedConditions.elementToBeClickable(postalcode)).click();
		wait.until(ExpectedConditions.elementToBeClickable( housernumber)).sendKeys("436");
		wait.until(ExpectedConditions.elementToBeClickable( street)).sendKeys("nagar-pune");
		wait.until(ExpectedConditions.elementToBeClickable(city)).sendKeys("pune");
		wait.until(ExpectedConditions.elementToBeClickable( state)).sendKeys("mahastrra");
		wait.until(ExpectedConditions.elementToBeClickable(checkout3)).click();

	}
	
	public void paymentviacashondelivery() {
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(paymentdropdown));
		Select paymentdrop = new Select(dropdown);
		paymentdrop.selectByVisibleText("Cash on Delivery");
	    wait.until(ExpectedConditions.elementToBeClickable(paymentconfirmbutton)).click();	
	 }
	
	public String paymentsuccessfullmessage() {
		return wait.until(ExpectedConditions.presenceOfElementLocated(payementsuccessmessage)).getText();
	}
}
