package week2.examples;

import java.util.Scanner;

public class LoopExamples2 {

    public static void main(String[] args) {
        //Write a java program that prints all odd numbers 
        //between 0 and 100
        /*
         * for(int j=1;j<=100;j=j+2) { //j+=2
         * System.out.println(j);
         * }
         */
        int j=1;
        while(j<=100) {
            System.out.println(j); 
            j+=2;
        }

        //Write a program that repeatedly asks the user for an integer 
        //and calculates the sum of those numbers. When the total 
        //exceeds 100, your program should stop asking for a new 
        //integer and print the number count and average of the numbers 
        //to the screen.
        Scanner input=new Scanner(System.in);
        int total=0;
        int numberCount=0;
        while(total<=100) {
            
            System.out.println("Enter an integer:");
            int number=input.nextInt();
            total = total + number;//total+=number;
            numberCount++;
        }
        System.out.println(total);
        System.out.println(numberCount);
        System.out.println((double)total/numberCount);
        

    }

}
