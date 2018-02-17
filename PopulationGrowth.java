package Examples;

import java.util.Scanner;

public class PopulationGrowth {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double x, x1, x2, x3, x4, x5;
		double y;
		
		System.out.print("Enter current world population: ");
		x = input.nextDouble();
		
		System.out.print("Enter annual world population growth rate (%): ");
		y = input.nextDouble();
		
		x1 = x + x*(y/100);
		x2 = x1 + x1*(y/100);
		x3 = x2 + x2*(y/100);
		x4 = x3 + x3*(y/100);
		x5 = x4 + x4*(y/100);
		
		System.out.printf("\nEstimated world population after 1 year is %.0f\n", x1);
		System.out.printf("Estimated world population after 2 years is %d\n", Math.round(x2));
		System.out.printf("Estimated world population after 3 years is %d\n", Math.round(x3));
		System.out.printf("Estimated world population after 4 years is %d\n", Math.round(x4));
		System.out.printf("Estimated world population after 5 years is %d\n", Math.round(x5));
		
	}

}
