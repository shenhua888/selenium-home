package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromedriver = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.manage().window().maximize();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement e = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xx")));
		} catch (TimeoutException e) {
			System.out.println("false");
		}
		
	}
}
