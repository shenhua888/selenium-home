package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelect {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();	
		driver.get("file:///C:/Users/shenhua/Desktop/test.html");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("Selector"));
		Select select = new Select(e);
//		select.selectByValue("peach");
		select.selectByVisibleText("香蕉");
	}

}
