package numberProgram;

public class class18
{

	public static void main(String[] args) 
	{
		int a=12;
		int temp=0;
		
		for(int i=2; i<11; i++)
		{
			if(a%i==0)
			{
				temp=1;
			}
			
			
		}
		if(temp==1)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println("number is prime");
		}
	}

}
