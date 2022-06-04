package pratice;

public class pattarn11 
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
				System.out.print(" *");
			}
			System.out.println();
		}
     
		for(int i=0; i<=7;i++)
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
