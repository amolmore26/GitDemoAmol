
public class ConstructorPrac 
{
	
	int result;
	
	public ConstructorPrac (int Marks)
	{
		result=Marks;
		System.out.println("This is constructor code");
	}
	
	public void display (String name)
	{
		System.out.println("This is method of displayed and result of "+ name +" is " + result);
		
	}

	public static void main(String[] args) 
	{
		// 
	/*	StringBuffer abb = new StringBuffer("AmolAjitMore");
		abb.reverse();
		System.out.println(abb);*/
		
		ConstructorPrac obj1 = new ConstructorPrac(55);
		obj1.display("amol more");
			
	}
	
}