package language.basics;

import java.time.LocalTime;

public class Assignment1_DataTypes {

	public static void main(String[] args) {

		// 1.Temperature of a city in degrees Celsius: 25.5
		float temperature = 25.5f;
		System.out.println("Temperature of a city in degrees Celsius: " + temperature);

		// 2. Whether a customer has placed an order: true or false
		boolean order = true;
		System.out.println("Whether a customer has placed an order: " + order);

		// 3. Person's phone number: "123-456-7890"
		String phoneNumber = "123-456-7890";
		System.out.println("Person's phone number: " + phoneNumber);

		// 4.Amount of money in a customer's bank account: 1000.50
		float amount=1000.50f;
		System.out.println("Amount of money in a customer's bank account: " + amount);
		
//		5. Person's email address: "john.doe@example.com"
		String emailAddress="john.doe@example.com";
		System.out.println("Person's email address: " + emailAddress);
		
//		6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		double latitude = 37.7749;
	    double longitude = -122.4194;
	    System.out.println("latitude: " + latitude);
	    System.out.println("longitude: " + longitude);
	    
//		7. Person's marital status: true or false
	    boolean maritalStatus= true;
	    System.out.println("Person's marital status: " + maritalStatus);
	    
//		8. Person's occupation: "Software Engineer"
	    String occupation="Software Engineer";
	    System.out.println("Person's occupation: " +occupation);
	    
//		9. Person's favourite colour: "Blue"
	    String favouriteColour="Blue";
	    System.out.println("Person's favourite colour: " + favouriteColour);
	    
//		10.Current year: 2023
	    int currentYear= 2023;
	    System.out.println("Current year:" + currentYear);
	    
//		11.Number of followers on a social media platform: 1,000,000
	    String numberOfFollowers= "1,000,000";
	    System.out.println("Number of followers on a social media platform: " + numberOfFollowers);
	    
//		12.Rating of a movie: 7.5
	    float rating_Of_A_Movie=7.5f;
	    System.out.println("Rating of a movie: " + rating_Of_A_Movie);
	    
//		13.Person's blood type: 'A'
	    char bloodType= 'A';
	    System.out.println("Person's blood type: " + bloodType);
	    
//		14.Title of a book: "To Kill a Mockingbird"
	    String title_Of_A_Book="To Kill a Mockingbird";
	    System.out.println("Title of a book: " + title_Of_A_Book);
	    
//		15.Number of employees in a company: 500
	    int number_Of_Employees=500;
	    System.out.println("Number of employees in a company: " + number_Of_Employees);
	    
//		16.Time of an event: 2:30 PM
	    LocalTime eventTime = LocalTime.of(14, 30); // 2:30 PM is 14:30 in 24-hour format
        System.out.println("Event Time: " + eventTime);
	    
//		17.Name of a country: "United States"
	    String countryName="United States";
	    System.out.println("Name of a country: " + countryName);
	    
//		18.Person's eye color: "Brown"
	    String eyeColor="Brown";
	    System.out.println("Person's eye color: " + eyeColor);
	    
//		19.Person's birthplace: "New York City"
	    String birthplace="New York City";
	    System.out.println("Person's birthplace: " + birthplace);
	    
//		20.Distance between two cities: 200.5
	    float distance=200.5f;
	    System.out.println("Distance between two cities: " + distance);

	}

}
