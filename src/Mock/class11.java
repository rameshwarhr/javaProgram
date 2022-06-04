package Mock;

public class class11
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s="india is my country and i love india";
		int v=0;
		int c=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='u'||s.charAt(i)=='i'||s.charAt(i)=='o')
			{
				v++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				c++;
			}
			
		}
		
		System.out.println("consonent -"+c);
		System.out.println("vowel -"+v);

	}

}
