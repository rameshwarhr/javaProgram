package Mock;

public class class13 
{
public static void main(String[]args)
{
	String s="Rameshwar";
	String rev=" ";
	
	s.toUpperCase();
	
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
		
}
