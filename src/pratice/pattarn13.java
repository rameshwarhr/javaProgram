package pratice;

public class pattarn13
{

	public static void main(String[] args) 
	{
	for(int i=7; i>=0; i--)
	{
		for(int j=6; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=0; k<=i; k++)
		{
			System.out.print("*");
		}
		for(int l=1; l<=i; l++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
