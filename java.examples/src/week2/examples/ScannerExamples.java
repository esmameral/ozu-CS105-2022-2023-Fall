package week2.examples;

import java.util.Scanner;

public class ScannerExamples {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter first number:");
       double number1 =input.nextDouble();
       System.out.println("Enter second number:");
       double number2 =input.nextDouble();
       double sum=number1+number2;
       System.out.println("Sum of "+number1+"+"+number2+"="+sum);
    }

}
