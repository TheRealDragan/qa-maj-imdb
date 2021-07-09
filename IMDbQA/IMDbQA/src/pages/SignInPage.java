package pages;

import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {
	private String yourNameBox = "Your name box";
	private String emailBox = "Email Box";
	private String passwordBox = "Password Box";
	private String reenterPasswordBox = "Reenter Password Box";
	private String createYourImdbAccountButton = "Create Your Imdb Account Button";

	public WebElement getSigninWithGoogleButton() {
		return findElement("//body/div[@id='wrapper']/div[@id='root']/div[@id='pagecontent']/div[@id='content-2-wide']/div[@id='signin-options']/div[1]/div[1]/a[4]/span[2]");
	}	
	
	public WebElement getSigninWithFacebookButton() {
		return findElement("//body/div[@id='wrapper']/div[@id='root']/div[@id='pagecontent']/div[@id='content-2-wide']/div[@id='signin-options']/div[1]/div[1]/a[3]/span[2]");

	}
	 
}