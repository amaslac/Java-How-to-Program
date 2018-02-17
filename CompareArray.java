import java.util.Arrays;
import java.util.Scanner;

public class CompareArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		System.out.print("Enter 5 elements of first array: ");
		
		for (int i = 0; i < array1.length; i++)
			array1[i] = input.nextInt();
		
		System.out.print("Enter 5 elements of second array: ");
		
		for ( int i = 0; i < array2.length; i++)
			array2[i] = input.nextInt();
		
		System.out.printf("\n%s\n%s\n\n", Arrays.toString(array1), Arrays.toString(array2));
	
		if (equal(array1, array2))
			System.out.println("Arrays have same elements");
		else
			System.out.println("Arrays do not have same elements");
	
	}
		
		private static boolean equal(int[] array1, int[] array2) {
			
			Arrays.sort(array1);
			Arrays.sort(array2);
	
			for (int i = 0; i < array1.length; i++) {
			
					if (array1[i] != array2[i])
						return false;	
			}
			return true;

		}
}


