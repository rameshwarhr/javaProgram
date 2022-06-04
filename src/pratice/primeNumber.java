package pratice;

public class primeNumber 
{
public static void main(String[] args) 
{
	int a=7;
	int temp=0;
	for(int i=2; i<a; i++)
	{
		if(a%i==0)
		{
			temp=temp+1;
		}
	}
	System.out.println(temp);
	if(temp>0)
		
	{
		System.out.println("number is not prime");
	}else {
		System.out.println("Number is prime");
	}
}
}
