package pratice;

public class lcmOfNumber 
{
	public static void main(String[] args) 
	{
		
		int a=12;
		int b=15;
        int gcd=1;
        int lcm=1;
        
		for(int i=1;i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
					
		}
		System.out.println("gcd of Number");
		System.out.println(gcd  );
		System.out.println("lcm of Number");
		lcm=a*b/gcd;
		System.out.println(lcm);
	}
}
