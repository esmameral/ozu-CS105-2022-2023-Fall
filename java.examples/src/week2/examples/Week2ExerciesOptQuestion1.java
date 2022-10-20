package week2.examples;

/**
 * Question 1: (Perfect number) A positive integer is called a perfect number if
 * it is equal to the sum of all of its positive divisors, excluding itself. For
 * example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28
 * = 14 + 7 + 4 + 2 + 1. There are four perfect numbers <10,000. Write a program
 * to find all these four numbers.
 * 
 * @author esma
 *
 */
public class Week2ExerciesOptQuestion1 {
	public static void main(String[] args) {
		for (int a = 1; a <= 10000; a++) {
			int sumOfDivisors = 0;
			for (int i = 1; i <= a / 2; i++) {

				if (a % i == 0)
					sumOfDivisors += i;

			}
			if (sumOfDivisors == a)
				System.out.println("Perfect number:" + a);

		}
	}
}