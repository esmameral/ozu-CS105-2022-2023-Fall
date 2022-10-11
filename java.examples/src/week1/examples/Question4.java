package week1.examples;

public class Question4 {

	public static void main(String[] args) {
		/*
		 * Write a program that prints the digits of a four-digit number one by one on
		 * the screen. Your program also should print the sum of its digits. The sample
		 * program output should be as follows: 
		 * Number:6547 
		 * First digit:7 
		 * Second digit:4
		 * Third digit:5 
		 * Fourth digit:6 
		 * Sum of digits: 23
		 * You should use  /  % operators
		 */
		
		int a=8375;
		
		int firstDigit=a%10;//result will be: 5
		int secondDigit= a/10%10; //  a/10 =837,  837%10=7
		int thirdDigit= a/100%10; //  a/100=83, 83%10=3
		int fourthDigit= a/1000;  // a/1000=8 
		
	   	
		System.out.println("First Digit:"+firstDigit);
		System.out.println("Second Digit:"+secondDigit);
		System.out.println("Third Digit:"+thirdDigit);
		System.out.println("Fourth Digit:"+fourthDigit);
		
		int sumOfDigits=firstDigit+secondDigit+thirdDigit+fourthDigit;
		System.out.println(fourthDigit+"+"+thirdDigit+"+"+secondDigit+"+"+firstDigit+"="+sumOfDigits);
		
		

	}

}
