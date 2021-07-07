package main;

import pages.HomePage;
import pages.SignInPage;

public class Main {

	public static void main(String[] args) {
		HomePage homePage = new HomePage();
		homePage.getSearchBar();
		homePage.getSignInButton();
		
		SignInPage signIn = new SignInPage();
		signIn.getYourNameBox();
	}


}
