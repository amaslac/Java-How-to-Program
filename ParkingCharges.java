package Examples;

import java.util.Scanner;

public class ParkingCharges {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double hours = 0;
		double total = 0;
		
		while (hours != -1) {
			
			System.out.print("Enter hours parked for current customer or -1 to quit: ");
			hours = input.nextDouble();
			
			System.out.printf("\nCharge for the current customer: %.2f\n ", calculateCharges(hours));
			
			total += calculateCharges(hours);
			
			System.out.printf("\nTotal of yesterday's receipts: %.2f\n\n", total);
			
			
		}
		
	}
	
	public static double calculateCharges (double hours) {
		
		hours = Math.round(hours + 0.5);
		
		double charges = 2 + (hours - 3) * 0.5;
		
		if (hours <= 3 && hours > 0)
			charges = 2;
		else if (hours <= 0)
			charges = 0;
		
		if (charges > 10)
			charges = 10;
		
		return charges;
	}

}
