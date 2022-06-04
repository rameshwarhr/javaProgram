package mock2;

public class class2 {

	public static void main(String[] args) 
	{
		String s= "im rameshwar rathod from digras";
		int vo=0;
		int con=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='u'|| s.charAt(i)=='o')
			{
				vo++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				con++;
			}
		}
		System.out.println(vo);
		System.out.println(con);

	}

}
