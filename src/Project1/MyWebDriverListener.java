package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class MyWebDriverListener implements WebDriverEventListener {

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("在页面发生跳转前的Url为：" + driver.getCurrentUrl());

	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("在页面发生跳转后的Url为：" + driver.getCurrentUrl());

	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("查找元素时的条件为：" + by.toString());

	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("找到元素，其条件为：" + by.toString());

	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("要单击的页面元素为：" + element.getAttribute("value"));

	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("单击的页面元素后的URL为：" + driver.getCurrentUrl());
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("更改前的值为：" + element.getAttribute("value"));

	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("更改后的值为：" + element.getAttribute("value"));

	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		java.util.Date currenttime = new java.util.Date();
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
				"yyyy_MM_dd_hh_mm_ss");
		String dateString = formatter.format(currenttime);
		File srcFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
			File screenshot = new File("E:\\" + dateString + ".png");
			FileUtils.copyFile(srcFile, screenshot);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		System.out.println("发生异常，原因为：" + throwable.getMessage());
		System.out.println("截图已保存至：" + "E:\\" + dateString + ".png");
	}
}
