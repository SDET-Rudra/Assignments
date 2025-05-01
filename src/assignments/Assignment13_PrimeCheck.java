package assignments;

public class Assignment13_PrimeCheck {

	public static void main(String[] args) {
		
		int n=25;
		
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				System.out.println("False: " + n + " " + "is Not a prime number");
				return;
			}
		}
		System.out.println("True: " + n + " " + "is a prime number");
	}

}
