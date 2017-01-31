package Test;

import java.awt.Image;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestPopUp {
	public static void main(String[] args) throws Exception {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);	
		
//		String chromedriver = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\chromedriver.exe";		
//		System.setProperty("webdriver.chrome.driver", chromedriver);
//		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
//		driver.get("http://wpjth.win/");
		driver.manage().window().maximize();

//		WebElement ele = driver.findElement(By.xpath("//*[@id='__QY_RM_Div']/following-sibling::*[1]"));
//		driver.switchTo().frame(ele);
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@class='nav']/ul/li[3]")).click();
		
		WebElement e = driver.findElement(By.id("kw"));
		e.sendKeys("av");
		WebElement b = driver.findElement(By.id("su"));
//		WebElement map = driver.findElement(By.name("tj_trmap"));
		b.click();
//		String threeClick = "arguments[0].click();arguments[0].click();arguments[0].click();";
		e.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript(threeClick, map);
//		js.executeScript(threeClick, b);
//        js.executeScript(threeClick, e);
        
        Actions action = new Actions(driver);
        action.sendKeys(Keys.LEFT);
        action.doubleClick();
	}

}
