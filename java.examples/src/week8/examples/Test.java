package week8.examples;


public class Test {

	public static void main(String[] args) {
		Vehicle vehicle1 = new BMW();
		Vehicle vehicle2 = new Car();
		
		System.out.println(vehicle1.toString());
		System.out.println(((BMW)vehicle1).getOwnerName());
		System.out.println(((BMW)vehicle2).getOwnerName());	
	}
}
