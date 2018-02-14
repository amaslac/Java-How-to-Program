import java.util.Arrays;
import java.util.Scanner;

public class OccuranceArray {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		int length = input.nextInt();
		
		int[] array = new int[length];
		
		System.out.printf("Enter %d elements of the array: ", length);
		
		for (int i = 0; i < array.length; i++)
			array[i] = input.nextInt();

		System.out.printf("\nGiven array is: %s\n\n", Arrays.toString(array));
		
		System.out.print("Enter the number to be checked: ");
		int number = input.nextInt();
		
		int counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (number == array[i])
				counter++;
		}
		
		System.out.printf("The number %d occurs %d times in the array\n", number, counter);
		
	}

}
