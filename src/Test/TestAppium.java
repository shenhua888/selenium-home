package Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAppium {

	public static void main(String[] args) throws MalformedURLException,
			InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		// 这句不是必须的
		capabilities.setCapability("deviceName", "2d12c201");
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("platformName", "Android");
		// capabilities.setCapability("appPackage", "com.android.chrome");
		// capabilities.setCapability("appActivity",
		// "com.google.android.apps.chrome.Main");
		AndroidDriver driver = new AndroidDriver(new URL(
				"http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.get("https://www.baidu.com");
		Thread.sleep(10000);
		// driver.quit();
		// System.out.println(driver.currentActivity());
		// Set handles = driver.getWindowHandles();
		// System.out.println(handles.size());
		Set<String> contexts = driver.getContextHandles();
		String oldContext = driver.getContext();
		for (String context : contexts) {
			if (context.equals("NATIVE_APP")) {
				driver.context("NATIVE_APP");
			}
		}
		//测试查找不存在的元素
		WebElement e = findElement(driver,"com.android.chrome:id/button_primaryzzzZ");
		System.out.println(e);
		if (null == e) {
			System.out.println("元素不存在，不报error");
		}
		driver.findElementById("com.android.chrome:id/button_primary").click();
		driver.context(oldContext);
		// driver.findElementByXPath("//android.widget.ScrollView//android.widget.ImageButton").click();
		driver.findElement(By.id("index-kw")).sendKeys("xxoo");
		driver.findElementById("index-bn").click();
		System.out.println("Page title is: " + driver.getTitle());
		Thread.sleep(10000);
		driver.quit();
	}

	public static WebElement findElement(WebDriver driver, String locator) {
		WebElement element = null;
		try {
		 element = (new WebDriverWait(driver,10))
				.until(new ExpectedCondition<WebElement>() {
					@Override
					public WebElement apply(WebDriver driver) {
						try {
							return driver.findElement(By.id(locator));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							return null;
						}

					}

				});
		} catch (TimeoutException e) {
			return null;
		}
		return element;

	}

	public static boolean isElementPresent(WebDriver driver, String myLocator,
			int timeOut) throws IOException {
		boolean isPresent = false;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		isPresent = wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver d) {
				return d.findElement(By.id(myLocator));
			}
		}).isDisplayed();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(myLocator)));
//		WebElement e = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(myLocator)));
		return isPresent;
	}
}