package Test;

import java.net.URL;

import java_cup.runtime.lr_parser;
import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestAndroidWeb {
	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {
		DesiredCapabilities caps = SelendroidCapabilities.android();
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new SelendroidDriver(url, caps);
		driver.get("http://m.ebay.de");
		WebElement element = driver.findElement(By.id("kw"));
		element.sendKeys("xxx");
//		driver.findElement(By.id("su")).click();
		element.submit();
		driver.quit();
		System.out.println("over");
	}
}