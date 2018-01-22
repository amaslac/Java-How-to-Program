package GetAge;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GetAgeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter the last name: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter the month of birth: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of birth: ");
		int day = input.nextInt();
		
		System.out.print("Enter the year of birth: ");
		int year = input.nextInt();
		
		
		LocalDate today = LocalDate.now();
		
		GetAge person = new GetAge(firstName, lastName, month, day, year);
		
		LocalDate birthday = LocalDate.of(person.getYear(), person.getMonth(), person.getDay());
	
		
		System.out.printf("%s %s is %d years old\n", person.getFirstName(), person.getLastName(), 
				ChronoUnit.YEARS.between(birthday, today));
		
		
	}
	

}