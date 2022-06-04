package OppsConcept;

public class ThisKeyword 
{
int rollnumber;

public ThisKeyword(int rollnumber)
{
this.	rollnumber=rollnumber;
	System.out.println(rollnumber);
}

public void method()
{
	System.out.println(rollnumber);
}
	
	public static void main(String[] args) 
	{
		ThisKeyword  n= new ThisKeyword (1000);
		n.method();
				

	}

}
