package mock2;

public class class4 {

	public static void main(String[] args)
	{
		
      String s="rameshwar";
      String st=s.toUpperCase();
      String rev="";
      
      for(int i=st.length()-1; i>=0; i--)
      {
    	  rev=rev+st.charAt(i);
      }
      System.out.println(rev);
	}

}
