package ArrayProgram;

public class class12
{

	public static void main(String[] args)
	{
		// Find duplicate value
		
		int a[]= {20,8,73,56,80,4,108,67,8,20};
	int temp=a[1];
	
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j]) 
			{
				System.out.println(a[j]);
			}
		}
	}

	}

}
