package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	WebDriver driver;
	
	@Test
	@Parameters ("browser")
	
	public void Verifypage(String browsername)
	{
		
		if(browsername.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		
		else if( browsername.equalsIgnoreCase("chrome")  ) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
			driver= new ChromeDriver(); 	
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
