package Examples;

import java.util.Scanner;

public class SeparatingDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		

		System.out.printf("Integer part of quotient is %d\n", integerPart(number1, number2));
		System.out.printf("Integer remainder is %d\n\n", integerRemainder(number1, number2));
		
		if (number1 >= 1 && number1 <= 99999)
			displayDigits(number1);
		else
			System.out.println("Invalid input");
	}
	
	public static int integerPart(int number1, int number2) {
		
		int result = number1 / number2;
		return result;
	}

	public static int integerRemainder(int number1, int number2) {
		
		int remainder = number1 % number2;
		return remainder;
	}
	
	
	public static void displayDigits(int number1) {
		
	    String result = "";
	    
	    for (int i = 0; number1 > 0; i++) {
	        
	    	if(i > 0) 
	        	result = "  " + result;
	        
	        result = number1 % 10 + result;
	        number1 /= 10;
	    }
	    
	    System.out.println(result);
	}
}
