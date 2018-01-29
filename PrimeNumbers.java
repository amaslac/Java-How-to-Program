package Examples;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integer: ");
		int number = input.nextInt();
		
		System.out.printf("Is prime number: %b\n", isPrime(number));

	}
	
	public static boolean isPrime(int number) {
		
		if (number < 2)
			return false;
		
		int x = (int) Math.sqrt(number); 
		for (int i = 2; i <= x; i++) {
			
			if (number % i == 0)
				return false;
					
		}
		
		return true;
	}

}
