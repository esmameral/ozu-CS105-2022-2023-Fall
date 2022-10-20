package week2.examples;

import java.util.Scanner;

/**
 * Question 1:
 * 
 * Let's write a program that reads the student's grade from the keyboard and
 * prints student’s letter grade on the screen. You can use following catalog
 * grading method:
 * 
 * A 90-100 
 * 
 * A- 80-89 
 * 
 * B+ 75-79 
 * 
 * B 70-74 
 * 
 * B- 65-69 
 * 
 * C+ 60-64 
 * 
 * C 55-59 
 * 
 * C- 50-54 
 * 
 * D+ 45-49 
 * 
 * D 40-44 
 * 
 * F 0-39
 * 
 * @author esma
 *
 */
public class Week2ExerciesQuestion1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter grade:");
		double grade=input.nextDouble();
		
		if(grade>=90)
			System.out.println("Letter grade:"+"A");
		else if (grade>=80) {
			System.out.println("Letter grade:"+"A-");
		}else if (grade>=75) {
			System.out.println("Letter grade:"+"B+");
		}else if (grade>=70) {
			System.out.println("Letter grade:"+"B");
		}else if (grade>=65) {
			System.out.println("Letter grade:"+"B-");
		}else if (grade>=60) {
			System.out.println("Letter grade:"+"C+");
		}else if (grade>=55) {
			System.out.println("Letter grade:"+"C");
		}else if (grade>=50) {
			System.out.println("Letter grade:"+"C-");
		}else if (grade>=45) {
			System.out.println("Letter grade:"+"D+");
		}else if (grade>=40) {
			System.out.println("Letter grade:"+"D");
		}else {
			System.out.println("Letter grade:"+"F");
		}
		//SECOND WAY
		
		if(grade<40)
			System.out.println("Letter grade:"+"F");
		else if (grade<45) {
			System.out.println("Letter grade:"+"D");
		}else if (grade<50) {
			System.out.println("Letter grade:"+"D+");
		}else if (grade<55) {
			System.out.println("Letter grade:"+"C-");
		}else if (grade<60) {
			System.out.println("Letter grade:"+"C");
		}else if (grade<65) {
			System.out.println("Letter grade:"+"B-");
		}else if (grade<70) {
				System.out.println("Letter grade:"+"B");
		}else if (grade<75) {
			System.out.println("Letter grade:"+"B");
		}else if (grade<80) {
			System.out.println("Letter grade:"+"B+");
		}else if (grade<90) {
			System.out.println("Letter grade:"+"A-");
		}else {
			System.out.println("Letter grade:"+"A");
		}
	}
}