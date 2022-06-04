package ArrayProgram;

public class class9 {

	public static void main(String[] args)
	{
		// copy all element from one array to another array
		
		int a[]= {20,8,73,56,80,4,108,67};
		
		int b[]=new int [8];
		
		b[0]=a[20];
		b[1]=a[8];
		b[2]=a[73];
		b[3]=a[56];
		b[4]=a[80];
		b[5]=a[4];
		b[6]=a[108];
		b[7]=a[67];
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(b[i]);
		}
		

	}

}
