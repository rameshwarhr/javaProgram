package Mock;


  public class class4 
   {
	public static void main(String[] args) 
  {
		String st="i am test engineer";
		String s=" ";
		
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)==' ')
			{
				s +='@';
			}
			else
			{
				s +=st.charAt(i);
			}
		}
		
		System.out.println(s);
		
		}
		
		
		
	
  }

  
