package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginRediff {

	
	@Test
	
	public void Login() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		ObjectRepository.Login rd = new ObjectRepository.Login(driver);
		rd.Emailid().sendKeys("hello");
		rd.EmailidPassword().sendKeys("newnew");
		rd.CaptureScrenShot();
	}
}
