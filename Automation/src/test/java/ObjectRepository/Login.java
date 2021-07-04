package ObjectRepository;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login {

	
	WebDriver driver;
	
	public Login (WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("login1");
	By Password = By.id("password");
	
	public WebElement Emailid() 
	{
		return driver.findElement(username);
	}
	
	public WebElement EmailidPassword() 
	{
		return driver.findElement(Password);
	}
	
	public void CaptureScrenShot ()throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\\\Eviitestcase\\\\shetty.png"));
		
		// D:\\Eviitestcase\\shetty.png
	}
	

}
