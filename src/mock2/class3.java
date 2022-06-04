package mock2;

public class class3 {

	public static void main(String[] args) 
	{
	String s="Rameshwar Rathod from Digras";
	String st=" ";
	
	for(int i=0; i<s.length(); i++)
	{
		if(s.charAt(i)=='r')
		{
			st +='#';
		}else {
			st +=s.charAt(i);
		}
			
	}
System.out.println(st);
	}

}
