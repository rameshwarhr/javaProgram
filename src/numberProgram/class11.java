package numberProgram;

public class class11 
{
public static void main(String[] args) 
{
	int a=8;
	int b=12;
	int gcd=0;
	
	for(int i=1; i<=a && i<=b; i++)
	{
		if(a%i==0 && b%i==0)
		{
			gcd =i;
		}
	}
	System.out.println(gcd);
}
}
