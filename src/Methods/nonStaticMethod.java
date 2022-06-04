package Methods;

public class nonStaticMethod 
{
	
	public void add() 
	{
		int a=200;
		int b=300;
		int c=a+b;
		
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		nonStaticMethod o=new nonStaticMethod();
		o.add();

	}

}
