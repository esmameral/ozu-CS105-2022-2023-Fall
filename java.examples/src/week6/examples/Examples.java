package week6.examples;

import java.util.Scanner;

public class Examples {

	public static void main(String[] args) {
		// week3Question5();
		// week3Question8();
		week3Question9();
		// week3Question10();

	}

	/**
	 * Write a program to find the first 50 prime numbers.
	 */
	public static void week3Question9() {
		int primeNumberCount = 0;
		int number = 2;// all numbers
		int elementCount = 0;
		// one line can contain only 10 prime numbers
		while (true) {
			if (isPrime(number)) {
				System.out.print(number + " ");
				elementCount++;
				if (elementCount == 10) {
					elementCount = 0;
					System.out.println();
				}
				primeNumberCount++;
				if (primeNumberCount == 50)
					break;
			}
			number++;

		}

	}

	private static boolean isPrime(int a) {
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Write a program that asks user for a number. Check that number is a prime
	 * number or not.
	 */
	public static void week3Question8() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = scn.nextInt();
		boolean isPrime = true;
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}

		}
		if (isPrime)
			System.out.println(a + " is a prime number");
		else
			System.out.println(a + " is not a prime number");
	}

	/**
	 * Develop a simple subtraction learning program. Ask user 5 substraction
	 * questions. Each of the iteration generate two random one digit numbers,
	 * prompt the user with a subtraction question. After a student answers all
	 * five, reports the score, number of correct answers, questions, correct
	 * answers, student’s response. You can use arrays for saving questions, answers
	 * and responses. Be careful about negative results. If your first random number
	 * is 3 and second random number is 9 then you should ask “9-3=?” not “3-9=?“
	 * 
	 */
	private static void week3Question5() {
		int i = 0;
		String[] questionsAndAnswers = new String[5];
		Scanner scn = new Scanner(System.in);
		int correctCount = 0;

		while (i < 5) {
			String text;
			int correctAnswer = 0;
			int random1 = (int) (Math.random() * 10);
			int random2 = (int) (Math.random() * 10);
			if (random1 > random2) {
				text = random1 + "-" + random2;
				correctAnswer = random1 - random2;
			} else {
				text = random2 + "-" + random1;
				correctAnswer = random2 - random1;
			}
			System.out.print(text + "?");
			int answer = scn.nextInt();
			if (answer == correctAnswer) {
				System.out.println("You are correct!");
				correctCount++;
				questionsAndAnswers[i] = text + "=" + answer + " correct";
			} else {
				System.out.println("Your answer is wrong.");
				System.out.println(text + " should be " + correctAnswer);
				questionsAndAnswers[i] = text + "=" + answer + " wrong";
			}
			i++;
		}
		System.out.println("Correct count is " + correctCount);
		for (String text : questionsAndAnswers) {
			System.out.println(text);
		}
	}

	/**
	 * Question 10: Suppose that you have a given array. Determine the presence or
	 * absence of duplicate elements.
	 * 
	 * Hint: think about using nested loops if array = {2,3,5,2,2,3,0} then program
	 * should print “There are duplicate elements” if array = {1,8,10,9,3,4,2} then
	 * program should print “There are no duplicate elements”
	 * 
	 */
	public static void week3Question10() {
		int a[] = { 1, 8, 10, 9, 3, 4, 2, 8 };
		int i;
		boolean isDublicateExists = false;
		for (i = 0; i < a.length; i++) {
			int current = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (current == a[j]) {
					isDublicateExists = true;
					break;
				}
			}
			if (isDublicateExists)
				break;
		}
		if (isDublicateExists)
			System.out.println("There are duplicate elements");
		else
			System.out.println("There are no duplicate elements");

	}

}
