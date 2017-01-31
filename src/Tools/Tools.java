package Tools;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Tools {
	WebDriver driver = new FirefoxDriver();
	
	public void openURL(String url) {
		driver.get(url);
	}
	
	public WebElement findElement(By by) {
		WebElement webElement = null;
		try {
			webElement = driver.findElement(by);
		} catch (Exception e) {
			System.out.println ("没找到"+by.toString());
			org.testng.Assert.fail("没找到"+by.toString());
			
		}
		return webElement;
	}

	
}
