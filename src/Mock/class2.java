package Mock;

public class class2
{

	public static void main(String[] args)
	{
	String st="I love My india bbbb";
	
	int v=0;
	int c=0;
	
	 st=st.toLowerCase();
	
	for(int i=0; i<st.length(); i++)
	{
		if(st.charAt(i)=='a'|| st.charAt(i)=='e' || st.charAt(i)=='i'|| st.charAt(i)=='u'|| st.charAt(i)=='o')
		{
		v++;
		}
		else if(st.charAt(i)>='a' && st.charAt(i)<='z')
		{
			c++;
		}
		
	}
	System.out.println(v);
	System.out.println(c);
	}
}
