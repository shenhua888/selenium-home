package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com/");
		WebElement e = driver.findElement(By.id("kw"));
		e.sendKeys("000000000000000000000");
		System.out.println("eeeeee"+e.getAttribute("value"));
	}

}
