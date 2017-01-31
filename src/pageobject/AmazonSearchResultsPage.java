package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultsPage {

	private WebDriver driver;
	
	@FindBy(id="result_0")
	private WebElement topResultTitle;
	
	public AmazonSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTopResultTitle() {
		return topResultTitle.getText();
	}
}

