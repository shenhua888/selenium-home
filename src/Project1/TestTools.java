package Project1;

import org.openqa.selenium.By;
import Tools.*;

public class TestTools {


	public static void main(String[] args) {
		Tools ts = new Tools();
		String url = "http://www.baidu.com";
		ts.openURL(url);;
		ts.findElement(By.id("kw1")).sendKeys("selenium");
		ts.findElement(By.id("su")).click();
	}

}
