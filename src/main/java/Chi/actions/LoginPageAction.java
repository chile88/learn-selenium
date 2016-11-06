package Chi.actions;

import Chi.pages.LoginPage;

public class LoginPageAction {
	
	
	LoginPage loginPage;
	
	public void Login(String userName, String passWord){
		// input userName
		loginPage.userName.sendKeys(userName);
		// input passWord
		loginPage.passWord.sendKeys(passWord);
		// click signIn button
		loginPage.signIn.click();
	}
}
