package pratice;

public class ReverseOfString 
{
public static void main(String[] args) 
{
	
	String s="Rameshwar Rathod";
	String rev=" ";
	
	for(int i=s.length()-1; i>=0; i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}
