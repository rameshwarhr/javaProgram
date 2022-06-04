package String;

public class ReverseString 
{

	public static void main(String[] args)
	{
	
String s= "rameshwar";
String reverse="";
System.out.println(s.toUpperCase());

for(int i=s.length()-1; i>=0; i--)
{
	reverse=reverse+s.charAt(i);
}
		System.out.println(reverse);
	}

}
