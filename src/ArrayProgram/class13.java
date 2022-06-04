package ArrayProgram;

public class class13
{

	public static void main(String[] args) 
	{
		// Second highest number
		
		int a[]= {20,8,73,56,80,4,108,67,8,20};
		
		int temp=a[2];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
System.out.println(a[1]);
	}

}
