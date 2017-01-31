package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jd {
	public static void main(String[] args) {
//		System.setProperty("webdriver.firefox.bin",
//				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		Navigation nv = driver.navigate();
		nv.to("http://www.jd.com/");
		// driver.get("http://www.jd.com/");
		driver.findElement(By.linkText("你好，请登录")).click();
		driver.findElement(By.id("loginname")).sendKeys("xxx");
		driver.findElement(By.id("nloginpwd")).sendKeys("ooo");
		driver.findElement(By.id("loginsubmit")).click();
		String ms = "请输入验证码";
		String message = driver.findElement(By.id("authcode_error")).getText();
		if (message.equals(ms)) {
			System.out.println("pass");
			// System.out.println(message);
		}

	}
}
