package pages;

public class Imdb {
	private HomePage _homePage;

	public HomePage homePage() {
		if (_homePage == null) {
			_homePage = new HomePage();
		}		
		return _homePage;
	}
		private SignInPage _signInPage;

		public SignInPage signInPage() {
			if (_signInPage == null) {
				_signInPage = new SignInPage();
			}		
			return _signInPage;
		}
		private CreateNewAccount _createNewAccount;

		public CreateNewAccount createNewAccount() {
			if (_createNewAccount == null) {
				_createNewAccount = new CreateNewAccount();
			}		
			return _createNewAccount;
	}
}