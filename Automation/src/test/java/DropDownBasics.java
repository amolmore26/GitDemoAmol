import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownBasics 
{

	
	@Test
	
	public void ButtonClickCrtAcc () throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.facebook.com/");
		
		driver.get("https://www.spicejet.com/");
	/*	driver.findElement(By.xpath("//*[@id=\"u_0_2_II\"]")).click();
		
	//	driver.findElement(By.xpath("//*[@id=\"day\"]")).click();
		
		WebElement month_drop = driver.findElement(By.id("day"));
		
		Select dropdown_value = new Select(month_drop);
		
		dropdown_value.selectByIndex(0);
		dropdown_value.getOptions();*/
		
	//	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		WebElement dropvalues = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select clickdropvalue = new Select(dropvalues);
		clickdropvalue.selectByIndex(1);
		List<WebElement> month=clickdropvalue.getOptions();
		int total_month = month.size();
		System.out.println("Total month is "+total_month);
		
		
	}
}
