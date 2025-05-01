package assignments;

public class Demo1 {
	
	static int count=0;
	
	Demo1(){
		this.count++;
	}

	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		System.out.println(obj.count);
	}

}
