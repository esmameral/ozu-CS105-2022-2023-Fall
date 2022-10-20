package week2.examples;

import java.util.Scanner;

/**
 * Question 2:
 * Write a program which takes the principal amount, interest rate and duration
 * from the keyboard and calculates the monthly interest. Interest amount is
 * calculated with the following formula:
 * <p>
 * Interest Amount= principal * duration * InterestRate / 1200
 * </p>
 * Remember to define the principal, interest rate and interest amount as double
 * variables. The duration should be defined as an integer.
 * 
 * When your program runs, it should write a message as follows:
 * <p><i>
 * You will earn an interest of 56.6666 TL in 5 months with 8.5% interest rate
 * over 1600.0 TL
 * </i></p>
 * You can also try to print amount in 56.66 format (only two digits after
 * decimal point)
 * 
 * 
 * @author esma
 *
 */
public class Week2ExerciesOptQuestion2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter principal:");
	       double amount=scanner.nextDouble();
	       System.out.println("Enter interest rate:");
	       double rate=scanner.nextDouble();
	       System.out.println("Enter duration:");
	       int duration=scanner.nextInt();
	       
	       double interestAmount= amount * duration * rate / 1200;
	       System.out.print("You will earn an interest of "+ interestAmount+"  TL in "+duration);
	       System.out.print(" months with "+rate+"% interest rate ");
	       System.out.println("over "+amount+" TL");
	       System.out.println("--------------------------------");
	       System.out.print("You will earn an interest of "+ (int)(interestAmount*100)/100.0+"  TL in "+duration);
	       System.out.print(" months with "+rate+"% interest rate ");
	       System.out.println("over "+amount+" TL");
	}
}