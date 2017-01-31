package Project1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestDragAndDrop {

	public static void main(String[] args) throws MalformedURLException, Exception {
		// TODO Auto-generated method stub
		String chromedriver = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
//		Navigation nv = driver.navigate();
//		nv.to("http://www.w3school.com.cn/tiy/t.asp?f=html5_draganddrop");
//		driver.get("http://www.w3school.com.cn/tiy/t.asp?f=html5_draganddrop");
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.switchTo().frame("i");
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);
		WebElement draggable = driver.findElement(By.id("draggable"));
		new Actions(driver).dragAndDropBy(draggable, 200, 0).build().perform();
		Thread.sleep(2000);
		new Actions(driver).dragAndDropBy(draggable, -100, 0).build().perform();
//		WebElement source = driver.findElement(By.xpath("//*[@id='drag1']"));
//		WebElement target = driver.findElement(By.xpath("//*[@id='div1']"));
//		source.click();
//		Actions action = new Actions(driver); 
//		action.dragAndDropBy(draggable, 200, 0).build().perform();
//		action.dragAndDropBy(source, 0, -100).build().perform();
//        action.dragAndDrop(source, target).build().perform();
//        action.release();
//		action.clickAndHold(source).build().perform();
//		action.moveToElement(target);
//		action.release(source);
//		action.build().perform();
//		action.dragAndDrop(source, target).build().perform();
//		action.clickAndHold(source).moveToElement(target);
//		action.release();
		System.out.println("over");
	}

}
