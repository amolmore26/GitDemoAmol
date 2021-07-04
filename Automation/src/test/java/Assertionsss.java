import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionsss
{
	
	@Test
	
	public void Test1() 
	{
		Assert.assertEquals(12, 13, "Please check with developer test1");
		System.out.println("Test completed test1");
	}
	
    @Test
	
	public void Test2()
    {
		Assert.assertEquals(13, 13, "Please check with developer test2");
		System.out.println("Test2 completed");
	}
    
    @Test
    public void test3 () 
    { 
    	Assert.assertTrue(false);
    	System.out.println("test 3 completed");
    }
    
    @Test
    public void testsoftassert () 
    { 
    	//
    	SoftAssert Asssertt = new SoftAssert();
    	Assert.assertTrue(false);
    	System.out.println("test assert completed");
    	Asssertt.assertAll();
    }
    

}
