package pratice;

public class primeNumber1 
{

	public static void main(String[] args) 
	{
	int a=7;
	int tmp=0;
	for(int i=2; i<=7; i++)
	{
		if(a%i==0)
		{
			tmp=tmp+1;
		}
	}

	if(tmp>0)
	{
		System.out.println("number is not prime");
	}else {
		System.out.println("number is  prime");
	}
	
	}

}
