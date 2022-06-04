package pratice;

public class reverseByWordByWord 
{
public static void main(String[] args) 
{
	
	String s="im Ramehswar Rathod";
	
	String[] a=s.split(" ");
	for(int i=a.length-1;i>=0; i--)
	{
		System.out.println(a[i]);
	}
	
	
}
}
