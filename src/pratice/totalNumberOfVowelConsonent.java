package pratice;

public class totalNumberOfVowelConsonent 
{
public static void main(String[] args) 
{
	
	String s="im Rameshwar Rathod im from digras dist yavatmal";
	
	int vowel=0;
	int conso=0;
	
	for(int i=0; i<s.length();i++)
	{
		if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='u'||s.charAt(i)=='i'||s.charAt(i)=='o')
		{
			vowel++;
		}
		else if(s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			conso++;
		}
	}
	System.out.println(vowel+" -all vowel");
	System.out.println(conso+" -all consonent");
}
}
