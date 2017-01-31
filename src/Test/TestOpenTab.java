package Test;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestOpenTab {
	public static void main(String[] args) throws Exception {
		String chromedriver = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\chromedriver.exe";
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-popup-blocking");
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		
		System.setProperty("webdriver.chrome.driver", chromedriver);
//		WebDriver driver = new ChromeDriver(capabilities);
		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.w3school.com.cn/tiy/t.asp?f=html5_draganddrop");
		driver.get("http://www.baidu.com");
		driver.manage().window().maximize();
//		driver.switchTo().frame("i");
		WebElement e = driver.findElement(By.id("kw"));
		e.sendKeys("av000000000000000000");
		Thread.sleep(2000);
//		WebElement e = driver.findElement(By.id("drag1"));
		Point point = e.getLocation();
		System.out.println(point);
//		WebElement e2 = driver.findElement(By.id("div1"));
//		Point point2 = e2.getLocation();
//		System.out.println(point);		
//		clidkAndMove(point,point2);
		clidkAndMove(point);
		
//		String oleHandle = driver.getWindowHandle();
//		 Actions action = new Actions(driver);
////		 action.sendKeys(Keys.TAB);
////		 action.keyDown(Keys.ALT).sendKeys(Keys.F4).keyUp(Keys.ALT).perform();
//		 action.keyDown(Keys.CONTROL).sendKeys("t").perform();
////		 action.keyDown(Keys.CONTROL).perform();
////		 action.sendKeys("t").perform();
////		 action.sendKeys(Keys.NULL);
////		 Thread.sleep(10000);
//		 action.release();
////		 action.sendKeys(Keys.CONTROL, "t");
////		openTab();
//		Set<String> handles = driver.getWindowHandles();
//		for (String handle : handles) {
//			if (handle != oleHandle) {
//				driver.switchTo().window(handle);
//			}
//		}
//		driver.get("http://www.douyutv.com");
//		driver.switchTo().window(oleHandle);
//		driver.get("http://www.pandatv.cc");
////		driver.findElement(By.id("panda_header_all_lives")).click();
	}

	/**
	 * 
	 * @Description: Control+t打开一个新的标签页
	 */
	public static void openTab() throws Exception {
		// 构建 Robot 对象，用来操作键盘
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_T);
		// 释放键盘动作
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyRelease(java.awt.event.KeyEvent.VK_T);
	}
	
	/**
	 * 
	 * @Description: 模拟鼠标左击按下右移
	 */
	public static void clidkAndMove(Point point) throws Exception {
		// 构建 Robot 对象，用来操作键盘
		Robot robot = new Robot();
		robot.mouseMove(point.x, point.y+70);
//		java.awt.Point point2 = MouseInfo.getPointerInfo().getLocation();
//		System.out.println(point2);	
		robot.delay(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(1000);
		robot.mouseMove(point.x+200, point.y+70);//移动鼠标到(100,200)点
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);//释放左键
	}
}
