
package week8.examples;



public class BMW extends Car {
	
	
	public String toString() {
		return super.getColor()+" BMW";
	}

	public String getOwnerName() {
		return "Kemal";
	}
	
	public BMW() {
		
	}

	public String getColor() {
		return "Red ";
	}

	
}
