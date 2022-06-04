package Mock;

public class class5 
{

	public static void main(String[] args) 
	{
		String st="india is my country";
		int count=0;
		
		for(int i=0; i<st.length();i++)
		{
			if(st.charAt(i)!=' ')
				count++;
		}
System.out.println(count);
	}

}
