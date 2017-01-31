package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

public class TestLogin {
	public void login1(String username, String password) {
//		System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mail.163.com/");
		Mail163 m = PageFactory.initElements(driver, Mail163.class);
		m.login(username, password);
	}

	public static void main(String[] args) {
		TestLogin tl = new TestLogin();
		tl.login1("justForYourTesting", "135135");
	}
}