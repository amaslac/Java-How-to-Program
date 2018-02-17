package Examples;

import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double weight;
		double height;
		double BMI;
		
		System.out.print("Enter weight (kg): ");
		weight = input.nextDouble();
		
		System.out.print("Enter height (m): ");
		height = input.nextDouble();
		
		BMI = weight/(height*height);
		System.out.println("***********************");
		System.out.printf("BMI is %f\n", BMI);
		System.out.println("***********************");
		System.out.printf("%s\n %s\n %s\n %s\n %s\n", "BMI VALUES", "Underweight: less than 18,5", 
				"Normal: between 18,5 and 24,9", "Overweight: between 25 and 29,9", "Obese: 30 or greater" );
	}

}
