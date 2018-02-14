package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[5];
		System.out.print("Enter 5 numbers between 10 and 100:");
		
		for (int i = 0; i < array.length; i++)
			array[i] = input.nextInt();
		
		System.out.printf("\n%s\n\n", Arrays.toString(array));
		
		System.out.print("Unique numbers are: ");
		
		for (int i = 0; i < array.length; i++) {
			
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (array[j] == array[i]) {
					duplicate = true;
					break;
					}
			}
			if (duplicate == false)
				System.out.printf("%d ", array[i]);
					
		}
		
	}

}
