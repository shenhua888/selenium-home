package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextSelection {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String chromedriver = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);
		WebDriver driver = new ChromeDriver();
//		driver.get("http://html5demos.com/drag");
		driver.get("http://tieba.baidu.com/p/1876743862");
		driver.manage().window().maximize();
//		driver.switchTo().frame("i");
//		WebElement source = driver.findElement(By.id("one"));
//		WebElement target = driver.findElement(By.id("bin"));
		WebElement source = driver.findElement(By.id("post_content_24467425577"));
//		WebElement target = driver.findElement(By.id("div1"));
		String basePath = new File("").getAbsolutePath();
		final String jsString = (basePath + "/src/testf/textSelection.js");
		String jsLoader = readFile(jsString);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(jsLoader, source);
	}

	private static String readFile(String file) throws IOException {
		Charset cs = Charset.forName("UTF-8");
		FileInputStream stream = new FileInputStream(file);
		try {
			Reader reader = new BufferedReader(
					new InputStreamReader(stream, cs));
			StringBuilder builder = new StringBuilder();
			char[] buffer = new char[8192];
			int read;
			while ((read = reader.read(buffer, 0, buffer.length)) > 0) {
				builder.append(buffer, 0, read);
			}
			return builder.toString();
		} finally {
			stream.close();
		}
	}
}
