package Examples;

import java.util.Scanner;

public class RoundingNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter double value: ");
		double number = input.nextDouble();
		
		System.out.printf("The original value: %f\n", number);
		System.out.printf("The number rounded to the nearest integer: %.0f\n", roundToInteger(number));
		System.out.printf("The number rounded to the nearest tenth: %.1f\n", roundToTenths(number));
		System.out.printf("The number rounded to the nearest hundredth: %.2f\n", roundToHundredths(number));
		System.out.printf("The number rounded to the nearest thousandth: %.3f\n", roundToThousandths(number));
		
	}
	
	public static double roundToInteger (double number) {
		
		number = Math.floor(number + 0.5);
		return number;
	}
	
	public static double roundToTenths (double number) {
		
		number = Math.floor(number * 10 + 0.5) / 10;
		return number;
	}
	
	public static double roundToHundredths (double number) {
		
		number = Math.floor(number * 100 + 0.5) / 100;
		return number;
	}
	
	public static double roundToThousandths (double number) {
		
		number = Math.floor(number * 1000 + 0.5) / 1000;
		return number;
	}

}
