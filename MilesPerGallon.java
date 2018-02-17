package Examples;

import java.util.Scanner;

public class MilesPerGallon {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int miles = 0;
		int gallons = 0;
		int tripCounter = 0;		
		double total = 0;
		double x = 0;
		double average;
		
		System.out.print("Enter miles or -1 to quit: ");
		miles = input.nextInt();
		
		if (miles != -1) {
			System.out.print("Enter gallons: ");
		    gallons = input.nextInt();
		    }
		
		while (miles != -1) {
			
			x = (double) miles / gallons;
			System.out.printf("Miles per gallon: %.2f\n\n", x);
			
			++tripCounter;
			total += x;
			
			System.out.print("Enter miles or -1 to quit: ");
			miles = input.nextInt();
			
			if (miles == -1) {
				break;
			}
			
			else {
				System.out.print("Enter gallons: ");
				gallons = input.nextInt();
				}
		}
		
		if (tripCounter != 0) {
			
			average = total / tripCounter;
			
			System.out.printf("\nCombined miles per gallon for %d trips: %.2f\n", tripCounter, average);
		}
		
		else 
			System.out.println("No miles were entered");
		
	}

}
