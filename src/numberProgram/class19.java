package numberProgram;

public class class19 
{

	public static void main(String[] args) 
	{
		int temp;
		int i;
		
	
		for( i=2; i<=100;i++)
		{
			temp=0;
			for(int j=2; i<=100/2; j++)
			{
				if(i%j==0)
				{
					temp=1;
				}
			}
			if(temp==0)
			{
				System.out.println(i+" ");
			}
			{
			
			}
		}

	}

}
