package week2.examples;

import java.util.Scanner;

public class LoopExamples1 {

    public static void main(String[] args) {
        // Question1:
        // Write a java program that prints your name
        // 10 times on the screen

        int i = 0;
        // for (i = 1; i <=10; i++)
        // for (i = 10; i <=100; i=i+10)
        for (i = 10; i >= 1; i--) {
            System.out.println(i + "Hello, Ali");
        }
        System.out.println("latest value of i:" + i);

        // Question2:
        // Write a java program that computes the sum of all
        // integers between [1, 100]
        int total = 0;
        for (int j = 1; j <= 100; j++) {
            total = total + j;
        }
        System.out.println("Total:" + total);
        
        // Question3:
        // Write a program that takes an integer (N) from
        // the user and calculate N!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer(N) for factorial:");
        int N = input.nextInt();
        int fact = 1;
        for (int j = 2; j <= N; j++) {
            fact = fact * j;
        }
        System.out.println(N + "!=" + fact);
        
        // Question4:
        // Write a java program that takes 10 integers
        // from the user and prints how many of them are
        // divisible by 5 and how many are divisible by 3.
        int countOfDivisibleBy5 = 0;
        int countOfDivisibleBy3 = 0;
        for (int k = 1; k <= 10; k++) {
            System.out.println("Enter an integer:");
            int number = input.nextInt();
            if (number % 5 == 0) {
                countOfDivisibleBy5++;
            }
            if (number % 3 == 0) {
                countOfDivisibleBy3++;
            }
        }
        System.out.println(countOfDivisibleBy3 + " numbers are divisible by 3");
        System.out.println(countOfDivisibleBy5 + " numbers are divisible by 5");

    }

}
