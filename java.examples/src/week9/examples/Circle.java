package week9.examples;

public class Circle extends Shape {
	double r;

	public Circle(double r) {
		super();
		this.r = r;
	}
	
	public Circle(double r, String name) {
		super(name);
		this.r = r;
	}


	@Override
	public double computeArea() {
		return Math.PI * Math.pow(r, 2);
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "] " +super.toString();
	}

}
