package softwaretesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage extends Basepage {
 
    public Loginpage(WebDriver driver) {
		super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// TODO Auto-generated constructor stub
	}
     
	// Locators
    private By  signin =By.cssSelector("a[data-test='nav-sign-in']");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton =  By.cssSelector("input[data-test='login-submit']");
    private By errorMessage = By.cssSelector("h3[data-test='error']");
    private By menuprofile = By.id("menu");
    
    public void clicklogin() {
      wait.until( ExpectedConditions.elementToBeClickable(signin)).click();
    }

    public void login(String username, String password) {
    WebElement useremail =  wait.until( ExpectedConditions.elementToBeClickable(emailField)); 
    	useremail.sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuprofile));
    }
    
    public boolean isuserloogedin(String expectedusername) {
     String actualusername = wait.until(ExpectedConditions.visibilityOfElementLocated(menuprofile)).getText();
     return actualusername.trim().equals(expectedusername);
		   	
    }

    
}
