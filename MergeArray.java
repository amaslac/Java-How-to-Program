import java.util.Arrays;

public class MergeArray {
	
	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3, 4, 5, 6, 7};
		int[] array2 = {6, 7, 8, 9};
		
		int[] array3 = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, array3, 0, array1.length);
		System.arraycopy(array2, 0, array3, array1.length, array2.length);
		
		System.out.printf("New array: %s", Arrays.toString(array3));
	}

}
