package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class TestWait {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com"); 
//		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("su"))); 
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 10)).until(new ExpectedCondition<WebElement>(){

			@Override
			public WebElement apply(WebDriver d) {
				// TODO Auto-generated method stub
				return d.findElement(By.id("su"));
			}
			
			
		});
		
		driver.findElement(By.id("kw")).sendKeys("xxoo");
		myDynamicElement2.click();

	}

}
