package Collection;

import java.util.ArrayList;

public class class1 
{
public static void main(String[] args) 
{
	ArrayList a=new ArrayList();
	
	a.add(10);
	a.add(50);
	a.add("Rameshwar");
	a.add(50.90);
	
	System.out.println(a);
	
	System.out.println(a.get(2));
	a.set(3, 100);
	System.out.println(a.set(3, 100));
}
}
