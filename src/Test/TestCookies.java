package Test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromedriver = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.manage().window().maximize();
//		for (Cookie cookie :driver.manage().getCookies()) {
//			System.out.println(cookie.getName());
//			System.out.println(cookie.getValue());
//			System.out.println(cookie.getDomain());
//		}
//		System.out.println(driver.getPageSource());
		Set<Cookie> cookies = driver.manage().getCookies();
		int i = 0;
		for (Cookie cookie : cookies) {
			i++;
			System.out.println("第" + i + "次");
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
			System.out.println(cookie.getDomain());
		}
	}

}
