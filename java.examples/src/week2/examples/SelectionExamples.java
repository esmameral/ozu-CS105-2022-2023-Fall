package week2.examples;

import java.util.Scanner;

public class SelectionExamples {

    public static void main(String[] args) {
        int a = 8, b = 99, c = 11;
        
        // First Way
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the max number");
                
            } else
                System.out.println(c + " is the max number");

        } else {
            if (b > c) {
                System.out.println(b + " is the max number");
            } else {
                System.out.println(c + " is the max number");
            }
        }
     // Second Way
        if(a>b&&a>c)
            System.out.println(a + " is the max number");
        else if (b>a && b>c)
            System.out.println(b + " is the max number");
        else //if (c>a && c>b)
            System.out.println(c + " is the max number");
        
        int x=8;
        switch (x+3) {
            case 11: {
                System.out.println("1"); 
            }
            case 4: {
                System.out.println("4"); 
            }
            case 5: {
                System.out.println("5"); 
                break;
            }
            default:
                System.out.println("100");
        }
        //Problem 2:
        //Read day number from the user and display 
        //day name on the screen 
        //1: Monday,.. 7: Sunday)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number:");
        int day =input.nextInt();
        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("INVALID DAY NUMBER");
        }
        
    }

}
