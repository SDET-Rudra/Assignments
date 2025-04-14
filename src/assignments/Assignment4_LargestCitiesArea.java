package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment4_LargestCitiesArea {

	public static void main(String[] args) {
		
		List<Integer> area= new ArrayList<Integer>();
		
		area.add(1000);
		area.add(2000);
		area.add(5000);
		area.add(6000);
		area.add(10000);
		area.add(9000);
		
		int thirdValue=area.get(2);
		int forthValue=area.get(3);
		
		System.out.println("Total of 3rd and 4th index value: " + (thirdValue+forthValue));
		
		
	}

}
