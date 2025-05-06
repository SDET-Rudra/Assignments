package assignments;

public class Demo1 {
	
	static int count=0;
	
	Demo1(){
		this.count++;
	}
	
	 public static void printMessage(String message){
		 
		 System.out.println(message);
		
	}
	 
	public static void printHello(){
			 
			 System.out.println("Hello World");
			
		}
	
	public  void printName(){
		 
		 System.out.println("Hello my name is Rudra");
		
	}

	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		System.out.println(obj.count);
	}

}
