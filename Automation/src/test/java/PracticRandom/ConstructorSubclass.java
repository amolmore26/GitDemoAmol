package PracticRandom;

public class ConstructorSubclass extends ConstructorrPrac 
{

	public ConstructorSubclass ()
	{
		super();
		System.out.println("this is constructor from child class of constructor");
	}
	
	public void add () {
		
	
		System.out.println("this is addition method");
		super.Firstparent();
	}
	
	public void Subtraction () {
		System.out.println("this is subtraction method");
	}
	
	public void Multiplication () {
		System.out.println("this is multiplication method");
	}
}
