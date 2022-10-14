package week3.examples;

public class ArrayQuestion3And4 {

    public static void main(String[] args) {
        /*
         * Question 3:
         * {500.0, 250.0, 125.0, 62.5, 31.25, ….} create the first 20 elements of this
         * array.
         * Find how many of the elements are integer and how many of them are <1
         */
        double[] a = new double[20];
        a[0] = 500;
        int intCount = 0;
        int lessThan1Count = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] / 2;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1)
                lessThan1Count++;
            if ((int) a[i] == a[i])
                intCount++;
        }
        System.out.println("count of integer values:" + intCount);
        System.out.println("count of <1 values:" + lessThan1Count);
        // Note:
        // Using second loop is not necessary. You can solve problem with using one loop
        // block.
        // But this time, you should not forget to check first element of the array. See
        // example below

        /*
         * Question 4:
         * {10, 3, 14, -22, 72, -188, 520, -1416, 3872, -10576} create the first 15
         * elements of this array.
         * First 2 elements are given. Find how many elements are positive.
         */

        double[] b = new double[15];
        b[0] = 10;
        b[1] = 3;
        int positiveNumberCount=0;
        
        if (b[0] > 0)
            positiveNumberCount++;
        if (b[1] > 0)
            positiveNumberCount++;

        for (int i = 2; i < b.length; i++) {
            b[i] = (b[i - 2] - b[i - 1]) * 2;
            if (b[i] > 0)
                positiveNumberCount++;

        }
        
        System.out.println("positive Number Count:" + positiveNumberCount);

    }

}
