package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;

public class LoginPagepage 
{

	@Test
	
	public void Checkvaliduser () 
	{
		WebDriver driver=PagemodelTestCase.Startbrowser("firefox", "http://demosite.centre/wordpress/wp-login.php");
		
		
		LoginPage login_new=PageFactory.initElements(driver, LoginPage.class );
		
		login_new.loginfb("admin", "demo123");
		
		
	}
	
	
}
