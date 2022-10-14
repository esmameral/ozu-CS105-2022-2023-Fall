package week3.examples;

public class MathArrayExamples {
public static void main(String[] args) {
//   System.out.println(Math.PI);
//   System.out.println(Math.round(6.74));
// 
//   System.out.println(Math.sqrt(16));
//   System.out.println(Math.pow(2,5));
   
 //  System.out.println((int)(Math.random()*90)+10);

    //Create an array with the size of 100 and fill it 
    //with random integers between [10,99]. numbers 
    //create another array with numbers<50
    
    int[] numbers=new int[100];
    int count=0;
    for(int i=0;i<numbers.length;i++) {
        numbers[i] = (int)(Math.random()*90)+10;
        if(numbers[i]<50) {
            count++;
        }
    }
    System.out.println(numbers);
    System.out.println(count);
    
    int[] secondArray=new int[count];
    int j=0;
    for(int i=0;i<numbers.length;i++) {
        if(numbers[i]<50) {
            secondArray[j] = numbers[i];
            System.out.print(secondArray[j]+" ");
            j++;
        }   
    }
    
    System.out.println(count);
    
   
   
} 
}
