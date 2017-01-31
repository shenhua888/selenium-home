package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class DuoWindows {

	public static void main(String[] args) {
		WebDriver mainWindow = new FirefoxDriver();
		mainWindow.get("http://www.baidu.com/");
		mainWindow.findElement(By.linkText("登录")).click();
		mainWindow.findElement(By.linkText("立即注册")).click();
		//��ȡ���л��Ӵ���
		System.out.println(mainWindow.getWindowHandles().size());
		java.util.Set<String> set = mainWindow.getWindowHandles();
		for(String str : set) {
			if (mainWindow.switchTo().window(str).getTitle().contains("百度一下")) {
				mainWindow.switchTo().window(str);
				break;
			}
		}
//		String[] handles = new String[mainWindow.getWindowHandles().size()];
//		mainWindow.getWindowHandles().toArray(handles);
//		WebDriver childWindow = mainWindow.switchTo().window(handles[1]);
		
//		childWindow.findElement(By.id("TANGRAM__PSP_4__account")).sendKeys("xxx");
//		WebElement password = childWindow.findElement(By.id("TANGRAM__PSP_4__password"));
//		password.sendKeys("ooo");
//		password.submit();
//		String err1 = childWindow.findElement(By.id("TANGRAM__PSP_4__accountError")).getText();
//		String err2 = childWindow.findElement(By.id("TANGRAM__PSP_4__pwd_checklist_len")).getText();
//		String err3 = childWindow.findElement(By.id("TANGRAM__PSP_4__verifyCodeError")).getText();
//		System.out.println(err1 + "\n" + err2 + "\n" + err3);
		
	}

}
