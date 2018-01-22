package Examples;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String employeeName;
		double numberHours;
		double hourlyRates;
		double salary;
		int employeeCounter;
		
		employeeCounter = 1;
		
		while (employeeCounter <= 3) {
			
			System.out.print("Enter the employee's name: ");
		    employeeName = input.nextLine();
		
		    System.out.print("Enter the employee's number of hours worked last week: ");
		    numberHours = input.nextDouble();
		
		    System.out.print("Enter the employee's hourly rates: ");
		    hourlyRates = input.nextDouble();
		
		    if (numberHours >= 40) {

		    	salary = 40 * hourlyRates +  (numberHours - 40) * hourlyRates * 1.50;
		    }
		    
		    else { 
		    	salary = numberHours * hourlyRates;	
		    }		
		    
		    System.out.printf("\nLast week salary of employee %s: $%.2f\n\n", employeeName, salary);
		    
		    
		    employeeCounter++;
		    
		    if (input.hasNextLine())
		    	employeeName = input.nextLine();
		}
	
	}
}
