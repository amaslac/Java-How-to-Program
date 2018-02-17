package Examples;

import java.util.Scanner;

public class Minimum3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		float number1 = input.nextFloat();
		
		System.out.print("Enter the second number: ");
		float number2 = input.nextFloat();
		
		System.out.print("Enter the third number: ");
		float number3 = input.nextFloat();
		
		System.out.printf("\nThe smallest number is %f\n", minimum3(number1, number2, number3));

		
	}
	
	public static float minimum3 (float number1, float number2, float number3) {
		
		float smallest = Math.min(number1, number2);
		if (smallest < number3)
			smallest = smallest;
		else
			smallest = number3;
		return smallest;
	}

}
