package week1.examples;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * if radius = 12.45 and pi= 3.141519  then compute the area using the 
		 * following formula:
		 * area = radius * radius * pi
		 * There must be 3 digits after the decimal point.
		 */
			
		 double radius=12.45;
		 double PI=3.141519;
		 double area=radius*radius*PI;
		 System.out.println("Actual Area="+area);
		 System.out.println("Area="+(int)(area*1000)/1000.0);
		 
		 
		 
		 //Sample code
		 double a=4.678;
//		 int a1=(int)(a*10); //46.78
//		 System.out.println(a1);
//		 System.out.println(a1/10.0);
		 
		 System.out.println((int)(a*10)/10.0);
		 
		 
		
		 
		 //486.943


	}

}
