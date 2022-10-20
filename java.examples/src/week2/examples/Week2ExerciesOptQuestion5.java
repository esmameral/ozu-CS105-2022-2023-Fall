package week2.examples;

import java.util.Scanner;

/**
 * Question 5:
 * 
 * Write a program that asks for the names and grades of 3 students and at the
 * end writes the name of the student with the highest grade.
 * 
 * @author esma
 *
 */
public class Week2ExerciesOptQuestion5 {

	public static void main(String[] args) {

		String maxName = "";
		int maxGrade = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter the name of the student: ");
			String name = input.next();
			System.out.println("Enter the score of that student: ");
			int grade = input.nextInt();
			if (grade > maxGrade) {
				maxGrade = grade;
				maxName = name;
			}
		}
		System.out.println("The max grade in this group is " + maxGrade + " by " + maxName);

	}

}
