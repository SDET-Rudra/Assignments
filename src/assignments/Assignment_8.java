package assignments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment_8 {

	public static void main(String[] args) {
		
		Map<Integer, Integer> transactions= new HashMap<Integer, Integer>();
		transactions.put(1, 50000);
		transactions.put(2, -2000);
		transactions.put(3, 3000);
		transactions.put(4, -15000);
		transactions.put(5, -200);
		transactions.put(6, -300);
		transactions.put(7, 4000);
		transactions.put(8, -3000);
		
		//System.out.println(transactions);
		
		int positiveCount = 0;
        int negativeCount = 0;
        int positiveSum =0;
        int negativeSum =0;
        int creditlimit=0;
        int debitlimit=0;
        
		
		System.out.println("Total Number of Transactions: " + transactions.size());
		
		for(int value :transactions.values()) {
			
			//System.out.println(transactions.get(i));
			
			if(value>0) {
	
				positiveCount++;
				positiveSum += value;
				
			}else if (value<0) {
				
				negativeCount++;
				negativeSum += value;
			}
		}
		
		System.out.println("cedit transaction count: " + positiveCount);
		System.out.println("Totalcrebit transaction amount: " + positiveSum);
		
		System.out.println("debit transaction count: " + negativeCount);
		System.out.println("Total debit transaction amout: " + negativeSum);
		
		System.out.println("Remaining balance: " + (positiveSum+negativeSum));
		
		
		for(int value :transactions.values()) {
			
			if(value>10000) {
				
				creditlimit++;
				System.out.println("Suspicious credit: " + creditlimit);
				
			}else if (value<= -10000) {
				
				debitlimit++;
				System.out.println("Suspicious debit: " + debitlimit);
			}
		}

	}

}
