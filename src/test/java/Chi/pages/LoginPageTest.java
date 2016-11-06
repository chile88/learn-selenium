package Chi.pages;

import org.testng.Assert;
import Chi.actions.LoginPageAction;


public class LoginPageTest extends TestBase{
	
	LoginPageAction loginPageAction;
	
	public void testLogin(){
		loginPageAction.Login("chile", "123456" );
		
		
	}

}
