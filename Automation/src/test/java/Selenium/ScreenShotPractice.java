package Selenium;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;





public class ScreenShotPractice {

	
	
	@Test
	public void Capturescreenshot () throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath(".//*[@id='emaill']")).sendKeys("hello");
	//Utility.CaptureSscrenshot(driver, "Facebook");
	}
	
	
	
/*	@AfterMethod
	
	public void teradown (ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus()) 
		{
			Utility.CaptureSscrenshot(driver, result.getName());
		}
		driver.quit();
	}*/
	
	
	}
	

