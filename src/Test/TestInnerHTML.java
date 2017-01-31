package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestInnerHTML {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromedriver = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", chromedriver);
		WebDriver driver = new ChromeDriver();
		driver.get("http://tieba.baidu.com/p/4497887017");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		WebElement e = driver.findElement(By.id("ueditor_replace"));		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", e);
        js.executeScript("arguments[0].innerHTML = '<h1>Selenium Test </h1>I love Selenium <br> this article Post By Selenium WebDriver<br><h2>Create By Young</h2>'", e);
        Thread.sleep(2000);
        WebElement e2 = driver.findElement(By.xpath("//*[@id='ueditor_replace']/h1"));
		Actions action = new Actions(driver); 

		action.dragAndDropBy(e2, -300, 0).build().perform();
		action.doubleClick();
//		action.doubleClick(e2);
//      action.dragAndDrop(source, target).build().perform();
//      action.release();
//		action.click(e);
//		action.clickAndHold(e).build().perform();
//		action.moveByOffset(0, -100);
//		action.release(e);
//		action.build().perform();
//		action.moveToElement(target);
//		action.release(source);
//		action.build().perform();
        System.out.println("over");
	}

}
