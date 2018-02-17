package Examples;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of a circle: ");
		double radius = input.nextDouble();

		System.out.printf("The area of the circle is %f\n", circleArea(radius));
	}
	
	public static double circleArea (double radius) {
		
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

}
