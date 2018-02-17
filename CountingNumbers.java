package Examples;

import java.util.Scanner;

public class CountingNumbers {
	
	public static void main(String args[]) {
		
       Scanner input = new Scanner(System.in);
       
       int countPositive = 0, countNegative = 0, countZero = 0;
       int array[] = new int[10];
		
       System.out.print("Enter 10 Numbers: ");
        
       for (int i = 0; i < 10; i++)
        	array[i] = input.nextInt();
    
       for (int i = 0; i < 10; i++) {
        	
            if (array[i] < 0)
                countNegative++;
            else if (array[i] == 0)
            	countZero++;
            else
            	countPositive++;
       }
		
       System.out.printf("\nPositive Numbers: %d\n", countPositive);
       System.out.printf("Negative Numbers: %d\n", countNegative);
       System.out.printf("Zero: %d\n", countZero);
    }

}
