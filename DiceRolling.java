package Examples;

import java.util.Random;

public class DiceRolling {

	public static void main(String[] args) {
	
		Random randomNumbers = new Random();
		int[] frequency = new int[13];
		int die1;
		int die2;
		int sum;
		
		for (int roll = 1; roll <= 36000000; roll++) {
	
			die1 = 1 + randomNumbers.nextInt(6);
			die2 = 1 + randomNumbers.nextInt(6);
			sum = die1 + die2;
			++frequency[sum];
		}
		
		System.out.printf("%s\t%s\n", "Sum", "Frequency");
		
		for (int face = 2; face < frequency.length; face++)
			System.out.printf("%d\t%d\n", face, frequency[face]);

	}

}
