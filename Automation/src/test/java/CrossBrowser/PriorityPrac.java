package CrossBrowser;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PriorityPrac {

	
	//WebDriver driver;
	
	
	@Test(priority=3)
	
	public void First () {System.out.println("first method");}
	
	
	
	@Test(priority=1)
	
	public void b_Second () {System.out.println("second method");}
	
@Test(priority=1)
	
	public void A_Third () {System.out.println("third method");}

@Test(priority=4)

public void Fourth () {System.out.println("fourth method");}
}
