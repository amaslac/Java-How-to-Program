package Examples;

import java.util.Scanner;

public class SalesCommission {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double earnings;
		double x;
		int item1Quantity, item2Quantity, item3Quantity, item4Quantity;
		
		System.out.print("Enter quantity of item 1 that salesperson sold last week: ");
		item1Quantity = input.nextInt();
		
		System.out.print("Enter quantity of item 2 that salesperson sold last week: ");
		item2Quantity = input.nextInt();
		
		System.out.print("Enter quantity of item 3 that salesperson sold last week: ");
		item3Quantity = input.nextInt();
		
		System.out.print("Enter quantity of item 4 that salesperson sold last week: ");
		item4Quantity = input.nextInt();

		x = item1Quantity * 239.99 + item2Quantity * 129.75 + 
				item3Quantity * 99.95 + item4Quantity * 350.89;
		
		earnings = 200 + 0.09 * x;
				
		System.out.printf("\nThe salesperson's earnings for the last week: $%.2f\n", earnings);

	}

}
