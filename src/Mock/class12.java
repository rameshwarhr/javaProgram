package Mock;

public class class12 
{

	public static void main(String[] args) 
	{
	String s="india is best country for living";
	String newString=" ";
	
	for(int i=0; i<s.length();i++)
	{
		if(s.charAt(i)==' ')
			newString +='%';
		else 
		{
			newString +=s.charAt(i);
		}
	}
			
			System.out.println(newString);

	}

}
