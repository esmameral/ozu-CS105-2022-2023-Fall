package week2.examples;

import java.util.Scanner;

/**
 * Question 1:
 * 
 * Let's write a program that reads an integer from the keyboard and prints
 * whether it is a perfect number or not. Your program should also print all its
 * divisors. A positive integer is called a perfect number if it is equal to the
 * sum of all of its positive divisors, excluding itself. For example, 6 is the
 * first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 +
 * 1.
 * 
 * 
 * @author esma
 *
 */
public class Week2ExerciesQuestion2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();
			int sumOfDivisors = 0;
			for (int i = 1; i <= number/ 2; i++) {

				if (number % i == 0) {
					sumOfDivisors += i;
					System.out.println("Divisor:"+i);
				}

			}
			if (sumOfDivisors == number)
				System.out.println(number + " is a perfect number" );
			else
				System.out.println(number + " is NOT a perfect number" );

				

		
	}
}