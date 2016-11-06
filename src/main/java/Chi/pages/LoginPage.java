package Chi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*
 * Login page
 * 
 * @author Chi Le
 */
public class LoginPage extends Page{

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(name = "username")
	@CacheLookup
	public WebElement userName;

	@FindBy(name = "password")
	@CacheLookup
	public WebElement passWord;
	
	@FindBy(xpath = "")
	@CacheLookup
	public WebElement signIn;
	
}
