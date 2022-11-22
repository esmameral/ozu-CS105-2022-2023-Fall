package week9.examples;

public class Rectangle extends Shape {
	private double a;
	private double b;

	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double computeArea() {
		return a * b;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "] " +super.toString();
	}

}
