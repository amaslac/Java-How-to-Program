package Examples;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		for (int i = 1; i <= 5; i++ )
		{
			System.out.print("Enter an integer between 1 and 30: ");
			number = input.nextInt();
			
			while (number < 1 || number > 30) {
			System.out.println("Please enter a valid integer: ");
			number = input.nextInt();
			}
			
			for (int j = 1; j <= number; j++)
			System.out.print("*");
		
		    System.out.println();
	    }	
	}
}
