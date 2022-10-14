package week3.examples;

import java.util.Scanner;

public class ArrayQuestion8 {

    public static void main(String[] args) {
        /*
         * Question 8:
         * Ask the user for the count of students and their scores.
         * Calculate the average score. Find how many student’s score < average score.
         * 
         */
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter Student count:");
      int count = scanner.nextInt();
      int[] grades = new int[count];
     
      int sum=0;
      for (int i = 0; i < grades.length; i++) {
          System.out.println("Enter grade=?");
          grades[i] = scanner.nextInt();
          sum+=grades[i];
      }
        
      double avg=(double)sum/count;
      
      System.out.println("avg:"+avg);
      int failCount=0;
      
      for (int aGrade : grades) {
          if(aGrade<avg) {
              failCount++;
          }
        
    }
      
      System.out.println("Failed student count:"+failCount);
      
        
    }

}
