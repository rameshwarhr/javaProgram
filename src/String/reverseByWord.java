package String;

public class reverseByWord 
{

	public static void main(String[] args) 
	{
		String s="Rameshwar Rathod";
		String a[]=s.split(" ");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
