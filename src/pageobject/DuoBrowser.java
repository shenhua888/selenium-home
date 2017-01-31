package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DuoBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver1 = new FirefoxDriver();
//		driver1.get("http://www.baidu.com/");
		String IEDriverServer = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", IEDriverServer);
		WebDriver driver2 = new InternetExplorerDriver();
//		driver2.get("http://mail.163.com/");
		driver2.get("http://mail.sina.com.cn/?from=mail");
		
//		WebElement element1 = driver1.findElement(By.id("kw"));
//		element1.sendKeys("我是一个人么");
//		driver1.findElement(By.id("su")).click();;
		
//		WebElement element2 = driver2.findElement(By.id("idPlaceholder"));
//		element2.sendKeys("18550157010");
//		WebElement element3 = driver2.findElement(By.id("pwdPlaceholder"));		
//		element3.sendKeys("shll123456!");
//		driver2.findElement(By.id("loginBtn")).click();
		
		WebElement element2 = driver2.findElement(By.id("freename"));

		WebElement element3 = driver2.findElement(By.id("freepassword"));
		String values1 = "shenhua266@sina.com";
		String values2 = "shll123456";
		JavascriptExecutor js = (JavascriptExecutor) driver2;
		js.executeScript("arguments[0].value=\"" + values1 + "\"", element2);
		js.executeScript("arguments[0].value=\"" + values2 + "\"", element3);
//		element2.sendKeys("shenhua266@sina.com");
//		element3.sendKeys("shll123456");
		driver2.findElement(By.xpath("//*[@class='freeMailbox']//*[@class='loginBtn']")).click();
	}

}
