package week3.examples;

public class NestedLoopExamples {

    public static void main(String[] args) {
        /*
         * Sample Question - 1
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         * Sample Question - 2
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(i);
         * }
         * System.out.println();
         * }
         */

        /*
         * Problem -1
         * for (int line = 1; line <= 5; line++) {
         * for (int j = 1; j <= (5-line); j++) {
         * System.out.print(".");
         * }
         * System.out.println(line);
         * }
         */
        /*
         * Problem - 2
         * for (int line = 1; line <= 5; line++) {
         * for (int j = 1; j <= (5-line); j++) {
         * System.out.print(".");
         * }
         * for (int k = 1; k <= line; k++) {
         * System.out.print(line);
         * }
         * System.out.println();
         * }
         */
        // Problem-3
        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (5 - line); j++) {
                System.out.print(".");
            }
            System.out.print(line);
            for (int j = 1; j <= (line - 1); j++) {
                System.out.print(".");
            }
            System.out.println();
        }

    }

}
