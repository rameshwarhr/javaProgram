package ArrayProgram;

import java.util.Arrays;

public class class10 
{

	public static void main(String[] args) 
	{
		// Aacending order
		
		int a[]= {20,8,73,56,80,4,108,67};
		int temp= a[5];
		
		
		for(int i=0; i<a.length; i++)
		{
			
			for(int j=i+1; j<a.length;j++)
				
			{
				if(a[i]>a[j])
					
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			System.out.println(a[i]);
		}
		
		
//Arrays.sort(a);
//System.out.println(Arrays.toString(a));
	}

}
