package Examples;

import java.util.Scanner;

public class ReversingDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integer: ");
		int number = input.nextInt();
		
		System.out.print("Entered number with its digits reversed: ");

		if (number >= 0)
			reverse(number);
	}
	
	
	public static void reverse (int number) {
		
		int result = 0;
		int count = 0;

	    while (number != 0) {
	    	
	    	if (number % 10 == 0)
	    		count++;
	    	
	        result = result * 10 + number % 10;
	        number /= 10;
	    }
	    
	    for (int i = 0; i < count; i++) {
	
	    	System.out.print(0);
	    }
  
	    System.out.print(result);
		
	}

}
