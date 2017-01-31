package Test;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestAppiumApp {

	public static void main(String[] args) throws MalformedURLException,
			InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "2d12c201");
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.android.settings");
		capabilities.setCapability("appActivity", ".Settings");
		AndroidDriver driver = new AndroidDriver(new URL(
				"http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(10000);
		driver.quit();
	}

}
