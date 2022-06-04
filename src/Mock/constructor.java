package Mock;

public class constructor 
{
	int a;
	int b;
	String s;
	
	public constructor()
	{
		a=60;
		b=40;
		int m=a+b;
		System.out.println(m);
	}

	public constructor(int a)
	{
		s="Snehal";
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		
		constructor c=new constructor();
		constructor v=new constructor(5);
	}
}
