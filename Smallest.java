package Examples;

import java.util.Scanner;

public class Smallest {
	
	public static void main(String[] args) {
	    
		int smallest = 0;
	    int large = 0;
	    int num;
	    
	    System.out.println("Enter 5 integers: ");
	    Scanner input = new Scanner(System.in);
	   
	    num = input.nextInt();
	    smallest = num; 
	   
	    for (int i = 1; i < 5; i++) {
	        num = input.nextInt();
	       
	        if (num > large) {
	            large = num;
	        }
	        
	        if (num < smallest) {
	            smallest = num;
	        }
	    }
	    
	    System.out.println("The largest number is: " + large);
	    System.out.println("The smallest number is : " + smallest);
	}
	

}
