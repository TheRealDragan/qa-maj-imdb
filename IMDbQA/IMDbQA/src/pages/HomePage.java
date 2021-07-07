package pages;

public class HomePage extends BasePage {
	private String searchBar = "Search Bar";
	private String signInButton = "Sign In Button";
	private String searchButton = "Search Button";

	 public void getSearchBar(){         
		 printMessage(searchBar);
		 }
	public void getSignInButton(){         
		printMessage(signInButton);
	 }
}
