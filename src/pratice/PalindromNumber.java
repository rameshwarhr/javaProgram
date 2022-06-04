package pratice;

public class PalindromNumber 
{
	public static void main(String[] args) 
	{
		int a=121;
		int temp=a;
		int rem=0;
		int rev=0;;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(rev==a)
		{
			System.out.println("number is palindrom");
		}else
		{
			System.out.println(" number is not palindrom");
		}
	}

}
