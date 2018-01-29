package Examples;

public class DisplayPerfect {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int n = 1; n < 1000; n++) {
			
			for (int i = 1; i < n; i++) {
				
				if (n % i == 0)
					sum += i;
			}
			
		if (sum == n) {
			
			System.out.println("\n\nPerfect number: " + sum);
		    System.out.print("Its factors: ");
		    
		    for (int i = 1; i < n; i++) {
		    
		    	if (n % i == 0)
				System.out.printf("%d ", i);
		    	}
		    }
			
		sum = 0;
			
		}

	}

}