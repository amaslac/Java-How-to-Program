package HealthProfile;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class HealthProfileTest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter the last name: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter the gender: ");
		String gender = input.nextLine();
		
		System.out.print("Enter the month of birth: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of birth: ");
		int day = input.nextInt();
		
		System.out.print("Enter the year of birth: ");
		int year = input.nextInt();
		
		System.out.print("Enter the weight in kg: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter the height in m: ");
		double height = input.nextDouble();
		
		
		HealthProfile person = new HealthProfile(firstName, lastName, gender, month,
				day, year, weight, height);
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(person.getYear(), person.getMonth(), person.getDay());
		
		long age = ChronoUnit.YEARS.between(birthday, today);
		long maxHeartRate = 220 - age;
		double BMI = weight/(height*height);
		
		System.out.println("**************************");
		System.out.printf("Name: %s %s \n", person.getFirstName(), person.getLastName());
		System.out.printf("Gender: %s\n", person.getGender());
		System.out.printf("Date of birth: %d/%d/%d\n", person.getMonth(), person.getDay(), person.getYear());
		System.out.printf("Weight: %.2f kg\n", person.getWeight());
		System.out.printf("Height: %.2f m\n", person.getHeight());
		System.out.println("**************************");
		System.out.printf("Age: %d\n", age);
		System.out.printf("Maximum heart rate: %d BPM (beats per minute)\n", maxHeartRate);
		System.out.printf("Target heart range: %.1f to %.1f BPM \n", maxHeartRate * 0.50, maxHeartRate * 0.85);
		System.out.printf("BMI: %.2f\n", BMI);
		System.out.println("**************************");
		System.out.printf("%s\n %s\n %s\n %s\n %s\n", "BMI VALUES", "Underweight: less than 18,5", 
				"Normal: between 18,5 and 24,9", "Overweight: between 25 and 29,9", "Obese: 30 or greater" );
		

		
		
	}

}
