package PracticRandom;

import org.testng.annotations.Test;

public class Methods2 
{

	
	@Test(priority=1)
	public void first () {
		System.out.println("this is first method from first class");
	}
	

	@Test(priority=2)
	public void second () {
		System.out.println("this is second method from first class");
	}
	

	@Test(priority=0)
	public void third () {
		System.out.println("this is third method from first class");
	}
	

	@Test(priority=3)
	public void fourth () {
		System.out.println("this is fourth method from first class");
	}
}
