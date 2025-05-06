package assignments;

public class Assignment13_PrimeCheck {

	public static void main(String[] args) {
		
//		int n=1;
//		
//		for(int i=2; i<n; i++)
//		{
//			if(n%i==0)
//			{
//				System.out.println("False: " + n + " " + "is Not a prime number");
//				return;
//			}
//		}
//		System.out.println("True: " + n + " " + "is a prime number");
		
		int input=7;
		
		boolean prime=true;
		
		if(input<=1) {
			
			System.out.println(input + " is not a prime number");
		}
		
		for(int i=2; i<input; i++) {
			
			if(input%i==0) {
				
				prime=false;
				System.out.println(prime);
			}
			//System.out.println(prime);
		}
		//System.out.println(prime);
	}

}
