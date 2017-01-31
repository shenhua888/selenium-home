package Project1;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class TestOpen {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		eventDriver.register(new MyWebDriverListener());
		Navigation navigation = driver.navigate();
		navigation.to("http://www.baidu.com");
		eventDriver.findElement(By.id("kw")).sendKeys("selenium");
		eventDriver.findElement(By.id("su")).click();
		try {
			eventDriver.findElement(By.id("xxxx"));
		} catch (Exception e) {

		}
		driver.quit();
	}

}
