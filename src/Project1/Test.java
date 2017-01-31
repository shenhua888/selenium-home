package Project1;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
//WebDriver��ִ��JavaScript
	public void testJavaScriptCalls() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = (String) js.executeScript("return document.title");
		assertEquals("�ٶ�һ�£����֪��", title);
		long links = (Long) js.executeScript("var links = "
				+ "document.getElementsByTagName('A'); "
				+ "return links.length");
		assertEquals(30, links);
		driver.close();
	}
	public static void main(String args[]) {
		Test test = new Test();
		test.testJavaScriptCalls();
	}
}
