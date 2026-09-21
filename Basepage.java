package softwaretesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {

           WebDriver driver;
	        WebDriverWait wait;

	    public Basepage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }

}
