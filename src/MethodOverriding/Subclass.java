package MethodOverriding;

public class Subclass extends SupreClass


{
	
	public  void method(char a)
{
	System.out.println("pant");
}

	public static void main(String[] args)
	{
		Subclass n=new Subclass();
		n.method();
		n.method('l');
		n.method(5);
		
		

	}

}
