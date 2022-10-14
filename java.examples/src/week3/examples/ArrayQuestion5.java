package week3.examples;

public class ArrayQuestion5 {

    public static void main(String[] args) {

        /*
         * Question 5:
         * Write a program for combining two arrays
         * Example
         * First array : {6,3,9,2,5}
         * Second array: {13,1,7}
         * Last Array: {6,3,9,2,5,13,1,7}
         * 
         */
        
        int a[] = {6,3,9,2,5};
        int b[] ={13,1,7};
        int c[] = new int[8];
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        for (int i = a.length; i < a.length+b.length; i++) {
            c[i]=b[i-a.length];
        }
        
        for (int value : c) {
            System.out.print(value+ " ");
        }

    }

}
