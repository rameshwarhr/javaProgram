package Mock;

public class class7
{

	public static void main(String[] args)
	{
		String s="i love india";
		int vowel=0;
		int cons=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='u'|| s.charAt(i)=='i'||s.charAt(i)=='o')
			{
				vowel++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				cons++;
			}
		}
        System.out.println(vowel);
        System.out.println(cons);
	}

}
