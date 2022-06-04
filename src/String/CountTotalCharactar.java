package String;

public class CountTotalCharactar 
{
public static void main(String[] args)
{
	String st="When you have a dream you have got to grab it and never let go";
	
	int count=0;
	
	for(int i=0; i<st.length(); i++)
	{
		if(st.charAt(i)!=' ')
		{
			count++;
		}
	}
	System.out.println(count);
}
}
