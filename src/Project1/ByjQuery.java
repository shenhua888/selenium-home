package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByjQuery {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.get("https://jquery.org/");
//		List<WebElement> elements = (List<WebElement>) jse
//				.executeScript("return jQuery.find('.menu-item')");
//		System.out.println(elements.size());
//		for(WebElement st : elements) {
//			System.out.println(st.getText());
//		}
		List<WebElement> elements = driver.findElements(By.className("menu-item"));
		System.out.println(elements.get(2).getText());
		System.out.println("----------------------------");
		for(WebElement st : elements) {
		System.out.println(st.getText());
	}

	}

}
