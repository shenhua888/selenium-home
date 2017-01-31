package pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestAmazon2 {

	
		WebDriver driver;
		@Test
		public void doBusiness() throws Exception {
			driver = new FirefoxDriver();
			AmazonHomePage homePage = AmazonHomePage.navigateTo(driver);
			AmazonSearchResultsPage resultsPage = homePage.searchFor("iain banks");
		}
		
		@AfterTest
//		 public void tearDown() {
//			driver.quit();
//		}
		public void closeBrowserSession() throws IOException {
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
			}
}
