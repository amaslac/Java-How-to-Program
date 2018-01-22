package Examples;

import java.util.Scanner;

public class CalculatingSales {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double product1 = 2.98;
		double product2 = 4.50;
		double product3 = 9.98;
		double product4 = 4.49;
		double product5 = 6.87;
		int product = 0;
		int quantity;
		double total = 0;
		
		
		while (product != -1) {
			
			System.out.print("Enter the product number or -1 to quit: ");
			product = input.nextInt();
			
			while (product < -1 || product == 0 || product > 5) {
				System.out.println("Please enter valid product number: ");
				product = input.nextInt();
			}
			
			if (product == -1) {
				break;
			}
			
			else {
				System.out.print("Enter the quantity sold: ");
				quantity = input.nextInt();
				}
			
			while (quantity < 0) {
				System.out.println("Please enter valid quantity sold: ");
				quantity = input.nextInt();
			}
			
			switch (product) {
			
			case 1: 
			total += product1 * quantity;
			break;
		    case 2: 
			total += product2 * quantity;
			break;
		    case 3:
			total += product3 * quantity;
			break;
		    case 4:
			total += product4 * quantity;
			break;
		    case 5:
			total += product5 * quantity;
			break;
			
			}
			
		}
		
		System.out.printf("\nThe total retail value of all products sold is $%.2f", total);
		
	}

}
