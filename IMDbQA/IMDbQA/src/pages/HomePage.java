package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	public WebElement searchBar() {
		return findElement("//input[@id='suggestion-search']");
	}
	
	public WebElement getSignInButton() {
		return findElement("//div[contains(text(),'Sign In')]");
	}
}
