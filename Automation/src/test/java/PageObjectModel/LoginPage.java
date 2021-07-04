package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 

{
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver= ldriver;
	}
	
	
	@FindBy(id="m_login_email") 
	WebElement username;
	
	// m_login_email
	//https://touch.facebook.com/?_rdr
	
	@FindBy(how=How.ID,using="m_login_password")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"login_password_step_element\"]/button")
	WebElement submitbutton;
	
	public void loginfb (String usid, String pwd) 
	{
		username.sendKeys(usid);
		password.sendKeys(pwd);
		submitbutton.click();
	}
}
