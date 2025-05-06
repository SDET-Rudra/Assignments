package assignments;

import java.util.Arrays;

public class Assignement15_String {

	public static void main(String[] args) {
		
		String sentence = "Java programming is fun and challenging";
		String reverseSentence="";
		System.out.println(sentence.length());
		
		for(int i=sentence.length()-1; i>=0; i--) {
			reverseSentence=reverseSentence+sentence.charAt(i);
			//System.out.println(reverseSentence);
		}
		
		System.out.println(reverseSentence);
		
		String [] spliltString= sentence.split(" ");
		
		for(int i=0; i<spliltString.length; i++) {
			
			//System.out.println(spliltString.length);
			System.out.println(spliltString[i].charAt(0));
			
			spliltString[i]=spliltString[i].substring(0,1).toUpperCase() + spliltString[i].substring(1);
		}
		
		System.out.println(Arrays.toString(spliltString));
	}

}
