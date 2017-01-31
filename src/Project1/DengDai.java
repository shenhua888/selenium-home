package Project1;

import java.util.logging.Logger;

import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.LoggingAssert;

public class DengDai {

	public static void main(String[] args) {
		// WebDriver driver = new FirefoxDriver();
		String chromedriver = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com/");
		// WebElement e = (new WebDriverWait(driver, 10))
		// .until(new ExpectedCondition<WebElement>() {
		// @Override
		// public WebElement apply(WebDriver d) {
		// return d.findElement(By.id("id locator"));
		// }
		// });
		// WebElement element = (new WebDriverWait(driver, 2))
		// .until(new ExpectedCondition<WebElement>() {
		//
		// @Override
		// public WebElement apply(WebDriver d) {
		// // TODO Auto-generated method stub
		// return d.findElement(By.id("kw"));
		// }
		//
		// });
		WebElement element = (new WebDriverWait(driver, 1))
				.until((WebDriver d) -> (d.findElement(By.id("twotabsearchtextbox"))));
		element.sendKeys("xxxxx");

	}

}
