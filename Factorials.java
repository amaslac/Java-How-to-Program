package Examples;

public class Factorials {

	public static void main(String[] args) {
	
		int counter;
		long factorial = 1;
		
		System.out.printf("%4s%30s\n\n", "Number", "Factorials");
		
		for (counter = 1; counter <= 20; counter++) {
			
			factorial = factorial * counter;
			System.out.printf("%4d%,30d\n", counter, factorial);
		}
		
	}

}
