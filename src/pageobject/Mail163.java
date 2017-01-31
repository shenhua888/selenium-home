package pageobject;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.pagefactory.WithTimeout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mail163 {
	WebDriver driver;
	
//	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@FindBy(id = "un-login")
	private WebElement username;

	@FindBy(id = "pwdInput")
	private WebElement password;

	@FindBy(id = "loginBtn")
	private WebElement loginBtn;

	public Mail163(WebDriver driver) {
		this.driver = driver;
	}
	public void login(String username, String pwd) {

		this.username.sendKeys(username);
		this.password.sendKeys(pwd);
		loginBtn.click();
	}
}
