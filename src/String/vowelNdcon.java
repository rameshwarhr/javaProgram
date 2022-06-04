package String;

public class vowelNdcon 
{

	public static void main(String[] args) 
	{
		int vowel=0;
		int con=0;
		
		String s="India is my country";
		
		
		System.out.println(s.toLowerCase());
		
		for(int i=0; i<s.length();i++)
		{
			   if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') 
			   {    
	                //Increments the vowel counter    
	                vowel++;    
		        }
			   else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			   {
				   con++;
			   }
	       }
	System.out.println(vowel);
	System.out.println(con);

}
}
