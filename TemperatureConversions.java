package Examples;

import java.util.Scanner;

public class TemperatureConversions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Celsius: ");
		double tempC = input.nextDouble();
		
		System.out.printf("The equivalent Fahrenheit temperature is %.2f\n\n", getF(tempC));
		
		System.out.print("Enter the temperature in Fahrenheit: ");
		double tempF = input.nextDouble();
		
		System.out.printf("The equivalent Celsius temperature is %.2f\n", getC(tempF));
	}
	
	public static double getF (double tempC) {
		
		double fahrenheit = 9.0 / 5.0 * tempC + 32;
		return fahrenheit;
	}

	public static double getC (double tempF) {
		
		double celsius = 5.0 / 9.0 * ( tempF - 32 );
		return celsius;
	}
}
