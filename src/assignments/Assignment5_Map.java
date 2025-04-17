package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class Assignment5_Map {

	public static void main(String[] args) {
		
		//********* Student Details**********//
		
		Map<String, String> student1= new HashMap<String, String>();
		student1.put("Name", "John Doe");
		student1.put("Age", "20");
		student1.put("Gender", "Male");
		student1.put("Roll Number", "S12345");
		student1.put("Grade", "A");
		student1.put("Major", "Computer Science");
		student1.put("GPA", "3.8");
		student1.put("Email", "john@example.com");
		student1.put("Contact Number", "9876543210");
		student1.put("Address", "123 Elm St");
		
		System.out.println("student1 Data: " + student1);
		
		Map<String, String> student2= new HashMap<String, String>();
		student2.put("Name", "Jane Smith");
		student2.put("Age", "21");
		student2.put("Gender", "Female");
		student2.put("Roll Number", "S12346");
		student2.put("Grade", "B");
		student2.put("Major", "Mathematics");
		student2.put("GPA", "3.5");
		student2.put("Email", "jane@example.com");
		student2.put("Contact Number", "9876543211");
		student2.put("Address", "456 Oak St");
		
		System.out.println("student2 Data: " + student2);
		
		Map<String, String> student3= new HashMap<String, String>();
		student3.put("Name", "Mike Brown");
		student3.put("Age", "22");
		student3.put("Gender", "Male");
		student3.put("Roll Number", "S12347");
		student3.put("Grade", "A");
		student3.put("Major", "Physics");
		student3.put("GPA", "3.9");
		student3.put("Email", "mike@example.com");
		student3.put("Contact Number", "9876543212");
		student3.put("Address", "789 Pine St");
		
		System.out.println("student3 Data: " + student3);
		
		List<Map<String, String>> studentDetails= new ArrayList<Map<String,String>>();
		studentDetails.add(student1);
		studentDetails.add(student2);
		studentDetails.add(student3);
		
		System.out.println(studentDetails);
		
		//********* Employee Details**********//
		
		Map<String, String> emp1= new HashMap<String, String>();
		emp1.put("Employee ID", "E001");
		emp1.put("Name", "Alice Green");
		emp1.put("Age", "30");
		emp1.put("Gender", "Female");
		emp1.put("Department", "Engineering");
		emp1.put("Position", "Software Engineer");
		emp1.put("Salary", "75000");
		emp1.put("Email", "alice@example.com");
		emp1.put("Contact Number", "9876543213");
		
		System.out.println("emp1 Data: " + emp1);
		
		Map<String, String> emp2= new HashMap<String, String>();
		emp2.put("Employee ID", "E002");
		emp2.put("Name", "Bob Johnson");
		emp2.put("Age", "35");
		emp2.put("Gender", "Male");
		emp2.put("Department", "Marketing");
		emp2.put("Position", "Marketing Manager");
		emp2.put("Salary", "85000");
		emp2.put("Email", "bob@example.com");
		emp2.put("Contact Number", "9876543214");
		
		System.out.println("emp2 Data: " + emp2);
		
		Map<String, String> emp3= new HashMap<String, String>();
		emp3.put("Employee ID", "E003");
		emp3.put("Name", "Carol White");
		emp3.put("Age", "28");
		emp3.put("Gender", "Female");
		emp3.put("Department", "Sales");
		emp3.put("Position", "Sales Executive");
		emp3.put("Salary", "65000");
		emp3.put("Email", "carol@example.com");
		emp3.put("Contact Number", "9876543215");
		
		System.out.println("emp3 Data: " + emp3);
		
		List<Map<String, String>> empDetail= new ArrayList<Map<String,String>>();
		empDetail.add(emp1);
		empDetail.add(emp2);
		empDetail.add(emp3);
		
		System.out.println(empDetail);
		
		//********* Product Details**********//
		
		Map<String, String> prod1= new HashMap<String, String>();
		prod1.put("Product ID", "P001");
		prod1.put("Name", "Laptop");
		prod1.put("Category	", "Electronics");
		prod1.put("Price", "$1,200");
		prod1.put("Stock Quantity", "50");
		prod1.put("Supplier", "Tech Supplies");
		prod1.put("Warranty", "2 years");
		prod1.put("Rating", "4.5");
		prod1.put("Manufacturing Date", "1/15/2023");
		prod1.put("Expiry Date", "1/15/2025");
		
		System.out.println("prod1 Data: " + prod1);
		
		Map<String, String> prod2= new HashMap<String, String>();
		prod2.put("Product ID", "P002");
		prod2.put("Name", "Desk Chair");
		prod2.put("Category	", "Furniture");
		prod2.put("Price", "$150");
		prod2.put("Stock Quantity", "100");
		prod2.put("Supplier", "Office Depot");
		prod2.put("Warranty", "1 years");
		prod2.put("Rating", "4");
		prod2.put("Manufacturing Date", "1/10/2023");
		prod2.put("Expiry Date", "N/A");
		
		System.out.println("prod2 Data: " + prod2);
		
		Map<String, String> prod3= new HashMap<String, String>();
		prod3.put("Product ID", "P003");
		prod3.put("Name", "Coffee Maker");
		prod3.put("Category	", "Kitchen");
		prod3.put("Price", "$75");
		prod3.put("Stock Quantity", "200");
		prod3.put("Supplier", "KitchenWorld");
		prod3.put("Warranty", "6 months");
		prod3.put("Rating", "4.2");
		prod3.put("Manufacturing Date", "3/20/2023");
		prod3.put("Expiry Date", "3/20/2024");
		
		System.out.println("prod3 Data: " + prod3);
		
		List<Map<String, String>> prodDetails= new ArrayList<Map<String,String>>();
		prodDetails.add(prod1);
		prodDetails.add(prod2);
		prodDetails.add(prod3);
		
		System.out.println(prodDetails);
		System.out.println(prodDetails.get(1).get("Supplier"));
		
		Map<String, List<Map<String, String>>> data= new HashMap<String, List<Map<String,String>>>();
		data.put("Student Data", studentDetails);
		data.put("Emp Data", empDetail);
		data.put("Product Data", prodDetails);
		
		System.out.println("All data: " + data);
		System.out.println(data.get("Product Data").get(1).get("Supplier"));
		
		
	}

}
