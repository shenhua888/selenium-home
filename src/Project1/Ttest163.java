package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ttest163 {

	public static void main(String[] args) throws InterruptedException {

		// 启动浏览器，进入163邮箱首页
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mail.163.com/");

		Thread.sleep(5000);

		// 输入用户名密码，登录邮箱

		WebElement youxiangzhanghao_element = driver.findElement(By
				.id("idInput"));
		youxiangzhanghao_element.clear();

		youxiangzhanghao_element.sendKeys("justForYourTesting");

		WebElement mima_element = driver.findElement(By.id("pwdInput"));
		mima_element.sendKeys("135135");

		WebElement denglu_element = driver.findElement(By.id("loginBtn"));

		denglu_element.click();

		Thread.sleep(10000);

		driver.close();
	}

}
