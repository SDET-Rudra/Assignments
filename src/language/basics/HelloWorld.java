package language.basics;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		System.out.println("Automation Training");
		
//		System.out.print("Ravi");
//		System.out.print("Ram");
		
		System.out.printf("Hello, %s! your age is %d, you are a male %b.%n", "Rudra",32,true);
		//System.out.print("Ram");
		
		Logger log= Logger.getLogger("Aplication Test Logger");
		log.info("Current line is 19");
		log.warning("Current line is 20");

}
	}
