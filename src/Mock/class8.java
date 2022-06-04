package Mock;

public class class8 
{

	public static void main(String[] args) 
	{
		String st="india is my country";
		String s="";
		
		for(int i=0; i<st.length();i++)
		{
			if(st.charAt(i)==' ')
			{
				s +='-';
			}
			else
			{
				s +=st.charAt(i);
			}
		}
              System.out.println(s);
	}

}
