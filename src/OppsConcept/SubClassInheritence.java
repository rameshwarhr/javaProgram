package OppsConcept;

public class SubClassInheritence extends SuperClassInheritence
{

	public static void main(String[] args)
	{
		// Normal Way of to calll the method
		
//		SuperClassInheritence obj= new SuperClassInheritence ();
//		obj.method1();
//		obj.method1(1);
//		obj.method1('g');
//		
//		SuperClassInheritence.method();
//		SuperClassInheritence.method(5);
//		SuperClassInheritence.method('k');
		
		
		method();
		method(5);
		method('l');
		
		SubClassInheritence sub = new SubClassInheritence();
		sub.method1();
		sub.method1(4);
		sub.method1('j');
		
		
	}

}
