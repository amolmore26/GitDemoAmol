package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PagemodelTestCase 
{
	static WebDriver driver;
	
	public static WebDriver Startbrowser (String browsername, String url) {
		
		if (browsername.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		else if (browsername.equalsIgnoreCase("chrome"))	
		{
			driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	
	}

}
