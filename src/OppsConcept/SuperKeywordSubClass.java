package OppsConcept;

public class SuperKeywordSubClass extends SuperKeywordSuperClass 
{
public String name="Nitin Satpute";

public void method()
{
	System.out.println(super.name);
	
	System.out.println(name);
}



public static void main(String[] args)
{
	SuperKeywordSubClass m = new SuperKeywordSubClass();
	m.method();
}
}
