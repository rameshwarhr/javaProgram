package pratice;

public class StringTotalCharCount 
{

	public static void main(String[] args) 
	{
		String s="Rameshwar Rathod";
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
System.out.println(count);
	}

}
