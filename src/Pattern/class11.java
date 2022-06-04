package Pattern;

public class class11 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=0; i<=7; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int k=6; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int l=6; l>=i; l--)
			{
				System.out.print(" ");
			}
			for(int m=0; m<=i; m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=6; i>=0; i--)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int k=6; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int l=6; l>=i; l--)
			{
				System.out.print(" ");
			}
			for(int m=0; m<=i; m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
