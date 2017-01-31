package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestJS {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mail.163.com/");
		WebElement username = driver.findElement(By.id("idInput"));
		WebElement pwd = driver.findElement(By.id("pwdInput"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=\"ssssoo\"", username);
        js.executeScript("arguments[0].value=\"123456\"", pwd);
	}

}
