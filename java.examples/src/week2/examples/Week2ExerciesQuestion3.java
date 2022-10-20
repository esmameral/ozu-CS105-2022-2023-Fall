package week2.examples;

import java.util.Scanner;

/**
 * Question 1:
 * 
 * A palindrome number is the number that is equal to it when it is written in
 * reverse. 121, 333, 646 are palindrome numbers. Write a program, let your
 * program read a 3-digit integer from the user and write on the screen whether
 * the number is palindrome or not.
 * 
 * 
 * 
 * @author esma
 *
 */
public class Week2ExerciesQuestion3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();
		
		int lastDigit=number%10;
		int firstDigit=number/100;

			if (lastDigit==firstDigit) {
				System.out.println(number + " is a palindrome number");
			}else {
				System.out.println(number + " is NOT a palindrome number");
			}

		

	}
}