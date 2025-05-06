package assignments;

public class Demo2 extends Demo1 {
	
	private static String name() {
		System.out.println("Private method");
		String name="Rudra";
		return name;
	}
	
	public  void printName(){
		 
		 System.out.println("Hello my name is DigitalRudra");
		
	}

	public static void printHello(){
		 
		 System.out.println("Hello India");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Demo2 obj= new Demo2();
	System.out.println(Demo2.name());
	
	//Demo1 obj= new Demo1();
	//obj.printMessage("Hellorudra");
	
	Demo1.printMessage("Print Rudra");
	
	Demo1 obj= new Demo2();
	obj.printHello();
	obj.printName();

	Demo2.printHello();
	
	
	
	}
}
