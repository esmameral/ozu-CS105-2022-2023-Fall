package week3.examples;

public class ArrayQuestion6 {

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

    }

}
