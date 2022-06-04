package Collection;

import java.util.ArrayList;

public class class2 
{

	public static void main(String[] args)
	{
     // Specific dataType
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(50);
		a.add(80);
		a.add(450);
		a.add(10);
		
		System.out.println(a);
		System.out.println(a.get(3));
		
		
		
		ArrayList<String> b=new ArrayList<String>();
		b.add("Rameshwar Rathod");
		b.add("Snehal Patil");
		b.add("Nitin Satpute");
		b.add("Sneha Shambhakar");
		b.add("Bhagvat Dhade");
		
		
		//System.out.println(b);
		System.out.println(b.get(2));
		b.set(0, "Ram Rathod");
		System.out.println(b);
		b.size();
		System.out.println(b.size());
		
		b.remove(4);
		System.out.println(b);
		
	}

}
