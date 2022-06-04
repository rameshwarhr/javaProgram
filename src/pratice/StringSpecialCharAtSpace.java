package pratice;

public class StringSpecialCharAtSpace 
{

	public static void main(String[] args) 
	{
		String s="im Rameshwar Rathod i am from digras dist Yavatmal";
		String st=" ";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
				st +='@';
			else {
				st +=s.charAt(i);
			}
				
		}
System.out.println(st);
	}

}
