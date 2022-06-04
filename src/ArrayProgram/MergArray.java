package ArrayProgram;

public class MergArray 
{

	public static void main(String[] args) 
	{
		

		int[] a = { 10, 5, 3, 5 };
		int[] b = { 13333,9, 8, 5 };
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++)
                {
			c[a.length+i] = b[i];
		}
		//System.out.print(Arrays.toString(c));
		for (int i = 0; i < c.length; i++) 

               {
			System.out.print(c[i]+"  ");
			
		}
		
		
	}


	}


