package numberProgram;

public class class14
{

	public static void main(String[] args) 
	{
		int a=1234;
		int temp=a;
		int rem;
		int rev=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
System.out.println(rev);

if(rev==a)
{
	System.out.println(" number is palindrom");
}
else
{
	System.out.println("not palindrom number");
}
	}

}
