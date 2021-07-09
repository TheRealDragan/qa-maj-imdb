package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import browser.Browser;
import pages.BasePage;
import pages.Imdb;

public class SmokeTest extends BaseTest {	

	@Test
	public void searchResultTest() throws InterruptedException {
		imdb.homePage().searchBar().clear();
		imdb.homePage().searchBar().sendKeys("12 Angry Men");
		Thread.sleep(2000);
		WebElement result = BasePage.findElement("//body/div[@id='__next']/nav[@id='imdbHeader']/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[2]/div[1]");
		assertEquals("12 Angry Men", result.getText());

	}

	@Test
	public void socialMediaTest() throws InterruptedException {
		WebElement signInButton = imdb.homePage().getSignInButton();
		signInButton.click();
		Thread.sleep(2000);
		String textOnSigninWithGoogleButton = imdb.signInPage().getSigninWithGoogleButton().getText();
		String textOnSigninWithFacebookButton = imdb.signInPage().getSigninWithFacebookButton().getText();
		assertEquals("Sign in with Google", textOnSigninWithGoogleButton);
		assertEquals("Sign in with Facebook", textOnSigninWithFacebookButton);
	}
}
