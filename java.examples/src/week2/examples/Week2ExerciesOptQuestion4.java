package week2.examples;

import java.util.Scanner;

/**
 * Question 4: 
 * Write a program. Let your program take the 3 side lengths of a triangle from
 * the user and calculate the circumference of the triangle if the entries are
 * valid. In order for the entries to be valid, the sum of both sides of the
 * triangle must be greater than the 3rd edge.
 * 
 * @author esma
 *
 */
public class Week2ExerciesOptQuestion4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the 1st side:");
		int a = input.nextInt();
		System.out.println("Enter the length of the 2nd side:");
		int b = input.nextInt();
		System.out.println("Enter the length of the 3rd side:");
		int c = input.nextInt();

		if ((a + b > c) && (a + c > b) && (a + c > b)) {
			System.out.println("Valid triangle. Circumference:" + (a + b + c));
		} else {
			System.out.println("Invalid triangle");
		}

//Second way. But this is not a good way. There are repeating code blocks        
//        if (a + b > c) {
//            if (a + c > b) {
//                if (a + c > b) {
//                    System.out.println("Valid triangle");
//                } else {
//                    System.out.println("Invalid triangle");
//                }
//
//            } else {
//                System.out.println("Invalid triangle");
//            }
//        } else {
//            System.out.println("Invalid triangle");
//        }

	}
}