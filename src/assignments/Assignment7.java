package assignments;

import java.lang.runtime.SwitchBootstraps;

public class Assignment7 {

	public static void main(String[] args) {
		
		String customerName="john Doe";
		int creditScroe= 720;
		double income=55000.0;
		boolean isEmployed=false;
		double debtToIncomeRatio = 35.0;
		
		if(creditScroe>750) {
		
			System.out.println("Excellent credit score: loan automatically approved");
	}else if (creditScroe>=650) {
		if(income>=50000)
		{
		if(isEmployed==true)
			{
				if(debtToIncomeRatio<40)
				{
					System.out.println("Loan approved with additional checks");
				}else {
					System.out.println("loan denied: debtToIncomeRatio is high");
				}
			}else {
				System.out.println("loan denied: due to unemployed");
			}
	}else {
		System.out.println("loan denied: due to low income");
	}
		
	}else {
		System.out.println("loan denied: due to low credit score");
	}
		
		System.out.println("loan approval check for: " + customerName);
}
	
}

