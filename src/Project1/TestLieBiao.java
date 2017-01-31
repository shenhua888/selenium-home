package Project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.element.Element;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLieBiao {
	public static void main(String args[]) {
		String chromedriver = "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/shenhua/Desktop/22.html");	
		System.out.println(TestLieBiao.tableCol(driver, 2));
		
	}
	
	public static List<String> tableCol(WebDriver driver, int column)
    {
	    List<WebElement> elements = driver.findElements(By.xpath("//*[@id='table138']/tbody/tr"));
    	ArrayList<String> list = new ArrayList<String>();
        for(int row=2; row<elements.size()+1; row++){
        	String xpath = "//*[@id='table138']/tbody/tr["+row+"]/td["+column+"]";
        	WebElement table=driver.findElement(By.xpath(xpath));
        	String tablevalue = table.getText();
        	list.add(tablevalue);
        }
        return list;
        
    }	
}
