package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignments4_Movies {

	public static void main(String[] args) {
		
		List<String> higest_Grossing_Movies= new ArrayList<String>();
		
		higest_Grossing_Movies.add("BahuBali");
		higest_Grossing_Movies.add("KGF");
		higest_Grossing_Movies.add("Pushpa");
		higest_Grossing_Movies.add("3Idiots");
		higest_Grossing_Movies.add("Dhoom");
		
		System.out.println("List of the Movie: " + higest_Grossing_Movies);
		System.out.println("The third movie on the list is: " + " " + higest_Grossing_Movies.get(2));
			
	}

}
