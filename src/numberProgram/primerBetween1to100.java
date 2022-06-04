package numberProgram;

public class primerBetween1to100 {

	public static void main(String[] args) 
	{
		  int i, j, isPrime, n;
	        System.out.println("All Prime Numbers");
	 
	        for (i = 1; i <= 100; i++) 
	        {
	            isPrime = 0;
	         
	            for (j = 2; j <= i/2; j++) 
	            {
	                
	                if (i % j == 0) 
	                {
	                    isPrime = 1;
	                  //  break;
	                }
	            }
	 
	            if (isPrime == 0)
	                System.out.println(i + " ");
	        }
	 

	}

}
