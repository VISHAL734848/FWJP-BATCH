package Pac1;

import java.util.Scanner;

public class Q6 {
	
		public static void main(String[] args) {
			
		
			 Scanner scanner = new Scanner(System.in);
		        
		       
		        System.out.println("Enter a number: ");
		        int number = scanner.nextInt();
		        
		       
		        
		        // Reverse the digits using a for loop
		        int reversed = 0, original = number;
		        for (int temp = number; temp != 0; temp /= 10) {
		            int digit = temp % 10;
		            reversed = reversed * 10 + digit;
		        }
		        
		        // Check if the number is a palindrome
		        if (original == reversed) {
		            System.out.println(number + " is a palindrome.");
		        } else {
		            System.out.println(number + " is not a palindrome.");
		        }
		

		}

}
