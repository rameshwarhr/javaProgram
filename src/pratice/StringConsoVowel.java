package pratice;

public class StringConsoVowel 
{
public static void main(String[] args) 
{
	String s="india is my country";
	int con=0;
	int vowel=0;
	for(int i=0; i<s.length(); i++)
	{
		if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='u'|| s.charAt(i)=='i'|| s.charAt(i)=='o')
		{
			vowel++;
		}
		else if(s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			con++;
		}
		
	}
	System.out.println(vowel+" - vowels");
	System.out.println(con+ " -consonent");
}
}
