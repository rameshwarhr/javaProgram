package pratice;

public class pattarn4 
{
public static void main(String[] args) 
{
	for(int i=0; i<=7; i++)
	{
		for(int j=0; j<=i; j++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
	
	for(int k=6; k>=0; k--)
	{
		for(int l=0; l<=k; l++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
}
}
