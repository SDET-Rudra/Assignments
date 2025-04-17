package assignments;
import java.util.*;

public class Assignemnet6 {

	public static void main(String[] args) {
		
		String[] studentNames= {"Suresh","Mahesh","Naresh"};
		int[] marks= {75, 80, 82};
		
		int[] updatedMarks= new int[3];
		updatedMarks[0]=marks[0]+10;
		updatedMarks[1]=marks[1]+10;
		updatedMarks[2]=marks[2]+10;
		
		
		System.out.println("Avrage Marks: " + (updatedMarks[0]+updatedMarks[1]+updatedMarks[2])/3);
		
		Map<String, Integer> studentData= new LinkedHashMap<String, Integer>();
		studentData.put("Suresh", updatedMarks[0]);
		studentData.put("Mahesh", updatedMarks[1]);
		studentData.put("Naresh", updatedMarks[2]);
		System.out.println("Updated Student Marks: " + studentData);
	
	}

}
