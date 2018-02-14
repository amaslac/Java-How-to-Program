package Examples;

public class VarargsProduct {

	public static int product(int... numbers) {
		
		int total = 1;
		
		for (int i : numbers)
			total *= i;
		
		return total;
	}
	
	public static void main(String[] args) {
	
		int i1 = 5;
		int i2 = 7;
		int i3 = 9;
		int i4 = 2;
		
		System.out.printf("i1 = %d\ni2 = %d\ni3 = %d\ni4 = %d\n\n", i1, i2, i3, i4);
		
		System.out.printf("Product of i1 and i2 is %d\n", product(i1, i2));
		System.out.printf("Product of i1, i2 and i3 is %d\n", product(i1, i2, i3));
		System.out.printf("Product of i1, i2, i3 and i4 is %d\n", product(i1, i2, i3, i4));
			
	}

}
