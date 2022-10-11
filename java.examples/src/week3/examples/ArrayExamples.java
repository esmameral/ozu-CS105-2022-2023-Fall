package week3.examples;

public class ArrayExamples {

    public static void main(String[] args) {
       String[] names= {"Hanne","Kerem","Can","Ece"};
       double grades[] = new double[7];
       
       grades[2]=98;
       grades[6]=67;
       grades[2]=10;
       
       System.out.println(grades[2]);
       System.out.println(grades[6]);
       System.out.println(grades.length);
       
       for(int i=0;i<names.length ; i++) {
           System.out.println("Name:"+names[i]);
       }
       
       int[][] numbers= new int[3][4];
       numbers[0][3]=8;
       numbers[2][2]=10;
       System.out.println(numbers.length);
       System.out.println(numbers[0].length);
       
       for(int i=0;i<numbers.length;i++) {
           for(int j=0;j<numbers[0].length;j++) {
               System.out.print(numbers[i][j]+" ");
           }
           System.out.println();
       }
       
       int[][] matrix= {{3,4,5,6},{11,89,1},{88}};
       for(int i=0;i<matrix.length;i++) {
           for(int j=0;j<matrix[i].length;j++) {
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
       }

       
       

    }

}
