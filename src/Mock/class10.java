package Mock;

public class class10 
{
public static void main(String[] args) 
{
	String s="india is my country and i love india";
	int count =0;
	
	for(int i=0; i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
			count++;
	}
	System.out.println(count);
}
}
