package MethodOverLoading;

public class class2 
{
	int a;
	int b; 
	int c;
	public class2()
	{
		a=500;
		System.out.println(a);
	}
	
	public class2(int a)
	{
		b=500;
		c=600;
	System.out.println(b+c);
	}

	public static void main(String[] args) 
	{
		class2 v = new class2(1);

	}

}
