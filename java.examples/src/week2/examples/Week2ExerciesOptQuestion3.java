package week2.examples;

import java.util.Scanner;

/**
 * Question 3: Write a program that reads the radius of a circle from the user
 * and prints the circumference on the screen. If the radius is negative, the
 * program should display an error message to the user.
 * 
 * @author esma
 *
 */
public class Week2ExerciesOptQuestion3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter radius :");
		double radius = scanner.nextDouble();
		if (radius > 0) {
			double circumference = 2 * Math.PI * radius;
			System.out.println("circumference:" + circumference);
		} else {
			System.out.println("Radius cannot be negative");
		}
	}
}