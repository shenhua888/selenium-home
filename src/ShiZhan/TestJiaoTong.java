package ShiZhan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestJiaoTong {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String iedriver = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", iedriver);
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.jsjtxx.com/jpv2/web/personPlan.do");
		Thread.sleep(10000);
		driver.findElement(By.linkText("继续教育课程")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='login_select_01']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("320500")).click();
		Thread.sleep(1000);		
		WebElement e1 = driver.findElement(By.name("loginId"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=\"320523196505151618\"", e1);
		Thread.sleep(1000);
		WebElement e2 = driver.findElement(By.name("passwd"));
		js.executeScript("arguments[0].value=\"123456\"", e2);
		Thread.sleep(1000);
		driver.findElement(By.name("authCode")).click();
		Thread.sleep(30000);
		int i = 1;
		while (true) {			
			System.out.println(i);
			i++;
			WebElement ele = driver.findElement(By
					.xpath("//*[@id='warePageIndex']/ul/li[last()]"));
			String classValue = ele.getAttribute("class");
			if (classValue.equals("dfss_down")) {
				driver.findElement(
						By.xpath("//*[@id='warePageIndex']/ul/li[last()]/a"))
						.click();
			} else {
				Thread.sleep(10000);
			}
		}
	}

}
