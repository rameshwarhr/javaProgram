package Mock;

public class class3 
{
	
	public static String replacestring(String st)
	{
		String s=" ";
		
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)==' ')
				s += '-';
			else
				s +=st.charAt(i);
		}
		return s;
	}
	
	
	
	

	public static void main(String[] args) 
	{

		String st="i am test engineer";
		
		System.out.println(replacestring(st));
		
	}

}
