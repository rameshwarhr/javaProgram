package pratice;

public class replaceSpaceWithSpecialChar 
{
public static void main(String[] args) 
{
	String s="india is may country";
	String a=" ";
	for(int i=0; i<s.length(); i++)
	{
		if(s.charAt(i)==' ')
			a +='%';
		else
			a +=s.charAt(i);
	}
	
	System.out.println(a);
}
	
	
}
