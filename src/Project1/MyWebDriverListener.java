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
		System.out.println("��ҳ�淢����תǰ��UrlΪ��" + driver.getCurrentUrl());

	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("��ҳ�淢����ת���UrlΪ��" + driver.getCurrentUrl());

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
		System.out.println("����Ԫ��ʱ������Ϊ��" + by.toString());

	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("�ҵ�Ԫ�أ�������Ϊ��" + by.toString());

	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Ҫ������ҳ��Ԫ��Ϊ��" + element.getAttribute("value"));

	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ҳ��Ԫ�غ��URLΪ��" + driver.getCurrentUrl());
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("����ǰ��ֵΪ��" + element.getAttribute("value"));

	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("���ĺ��ֵΪ��" + element.getAttribute("value"));

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
		System.out.println("�����쳣��ԭ��Ϊ��" + throwable.getMessage());
		System.out.println("��ͼ�ѱ�������" + "E:\\" + dateString + ".png");
	}
}
