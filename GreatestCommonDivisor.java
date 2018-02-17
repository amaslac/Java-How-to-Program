package Examples;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int a = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int b = input.nextInt();
		
		System.out.printf("Greatest common divisor of %d and %d is: %d", a, b, gcd(a, b));

	}
	
	public static int gcd (int a, int b) {
		
		if (a == 0)
			return b;
		
		while (b != 0) {
			
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
		
	}

}
