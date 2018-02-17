package Examples;

public class Pythagorean {

	public static void main(String[] args) {
		
		int a, b, c;
		
		System.out.printf("%5s%5s%5s\n\n", "a", "b", "c");
		
		for (a = 1; a <= 500; a++) {
			
			for (b = 1; b <= 500; b++) {
				
				for (c = 1; c <= 500; c++) {
					
					if (a * a + b * b == c * c) {
						
						System.out.printf("%5d%5d%5d\n", a, b, c);
					}
				}
			}
		}
			
		
		
	}

}
