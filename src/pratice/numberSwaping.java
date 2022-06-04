package pratice;

public class numberSwaping 
{

	public static void main(String[] args)
	{
		int a=100;
		int b=400;
//		System.out.println("With the help of third variable");
//		int c=a;
//		
//		a=b;
//		System.out.println(a);
//		
//		b=c;
//		System.out.println(b);
		
		
		System.out.println("Without third Number");
		a=a+b;
		
		b=a-b;
		System.out.println(b +" -latest value of B");
		a=a-b;
		System.out.println(a+" -latest value of A");
		
	}
}
