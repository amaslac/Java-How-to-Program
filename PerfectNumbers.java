package Examples;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integer: ");
		int number = input.nextInt();
		
		System.out.printf("Is perfect number: %b\n", isPerfect(number));
	}
	
	public static boolean isPerfect(int number){
        
        int sum = 0;
        
        for (int i = 1; i < number; i++){
            
        	if (number % i == 0)
                sum += i;
        }
        
        if(sum == number)
            return true;
        else 
            return false;
        
     }
	
}   


