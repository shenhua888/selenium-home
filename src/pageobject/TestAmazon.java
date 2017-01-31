package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAmazon {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		AmazonHomePage homePage = AmazonHomePage.navigateTo(driver);
		AmazonSearchResultsPage resultsPage = homePage.searchFor("iain banks");
//		assertThat(resultsPage.getTopResultTitle(), is("Transition"));
//		System.out.println(resultsPage.getTopResultTitle());
	}

}
