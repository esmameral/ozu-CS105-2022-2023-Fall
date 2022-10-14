package week3.examples;

public class MathAndArrayExample9 {

    public static void main(String[] args) {
//Question 9
        /*
         * Question 9:
         * Create an array with the size of 100 and fill it with random integers between
         * [1,10].
         * a) Find how many elements of the array are equal to 1.
         * b) Find how many elements of the array are greater than 7.
         * c) Find average of the elements of the array.
         * d) Find how many elements of the array are greater than average.
         * 
         */

        int[] numbers = new int[100];
        int countZero = 0;
        int countGreaterThan7 = 0;
        int sum = 0;
        double avg = 0;
        int countGreaterThanAvg = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10) + 1;
            if (numbers[i] == 1) {
                countZero++;
            }
            if (numbers[i]>7) {
                countGreaterThan7++;
            }
            sum+=numbers[i];
        }

        avg=(double)sum/numbers.length;

        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > avg) {
                
                countGreaterThanAvg++;
            }
        }
        System.out.println("countGreaterThanAvg:"+countGreaterThanAvg);
        System.out.println("countZero:"+countZero);
        System.out.println("countGreaterThan7:"+countGreaterThan7);

    }

}
