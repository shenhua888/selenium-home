package pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class Test163_testNG {
	WebDriver driver;
	@Test
	public void login() {

		driver = new FirefoxDriver();
		driver.get("http://mail.163.com/");
		String username = "justForYourTesting";
		String password = "123456";
		Mail163 m = PageFactory.initElements(driver, Mail163.class);
		m.login(username, password);
	}
	@AfterTest
	public void closeBrowserSession() throws IOException {
		Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		}
}