package mock2;

public class class1 {

	public static void main(String[] args)
	{
		String s="im from digras";
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
