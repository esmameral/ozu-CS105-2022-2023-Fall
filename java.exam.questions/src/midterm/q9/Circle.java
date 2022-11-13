package midterm.q9;

public class Circle {
	private static double PI=3;
	private int radius=0;
	public Circle(int r) {
		this.radius=r;
	}
	public static double getPI() {
		return PI;
	}

	public static void setPI(double pI) {
		PI = pI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI*radius*radius;
	}

}
