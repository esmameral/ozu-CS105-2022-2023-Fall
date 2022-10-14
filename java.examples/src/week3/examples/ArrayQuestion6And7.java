package week3.examples;

public class ArrayQuestion6And7 {

    public static void main(String[] args) {
        // Question 6
        // Suppose you have an int array. If your array contains at least one
        // even number, your program should print "The array contains an even
        // integer", otherwise it should print "No even integers in the array".
        int[] a = { 51, 61, 11, 201, 91 };
        boolean evenStatu = false;
        for (int value : a) {
            if (value % 2 == 0) {
                System.out.println("The array contains an even integer");
                evenStatu = true;
                break;
            }

        }
        if (!evenStatu)
            System.out.println("No even integers in the array");

        // Question 7
        /*
         * Suppose that you have a double array. If all of elements are positive your
         * program should print “Hey, this is a positive array” otherwise it should
         * print “this array contains negative numbers”
         */
        double[] b= {12.4, -18.98, -1,0.001,9.002};
        boolean isPositive=true;
        for (double value : b) {
            if (value < 0) {
                isPositive = false;
                break;
            }
        }
        if(isPositive)
            System.out.println("Hey, this is a positive array");
        else
            System.out.println("this array contains negative numbers");
        
    }

}
