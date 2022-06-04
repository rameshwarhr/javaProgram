package numberProgram;

public class class12
{

	public static void main(String[] args) 
	{
		int a=12;
		int b=15;
		int gcd=0;
		int lcm=0;
		
		for(int i=1; i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
System.out.println("gcd is  -"+gcd);

lcm=a*b/gcd;
System.out.println("lcm is  "+lcm);
	}

}
