package softwaretesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class filterproductpage extends Basepage {
	//Locators
	private By homenav = By.xpath("//a[@data-test='nav-home']");
	private By searcbox = By.id("search-query");
	private By searchicon = By.xpath("//button[@data-test='search-submit']");
	private By searchcaption = By.cssSelector("h3[data-test='search-caption']");

	
	public filterproductpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//navigate homepage
	public void gohome() {
        wait.until(ExpectedConditions.elementToBeClickable(homenav)).click();

	}
	// locate searchbox and search for keyword
	public void verifysearchfunction(String searchkey) {
    wait.until(ExpectedConditions.elementToBeClickable(homenav)).click();	
	WebElement search = wait.until(ExpectedConditions.elementToBeClickable(searcbox));
	search.sendKeys(searchkey);	
	wait.until(ExpectedConditions.elementToBeClickable(searchicon)).click();
    
	}
	
	// checks the result is according to search 
  public boolean getsearchtitle(String Searchkey) {
		String searchresultcaption = driver.findElement(searchcaption).getText();
	    return searchresultcaption.contains(Searchkey); 
  }
  
  
  
  
}
