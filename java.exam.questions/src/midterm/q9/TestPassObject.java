package midterm.q9;

public class TestPassObject {
	public static void main(String[] args) {
		
		int r=2;
		printAreas(new Circle(r));
		Circle.setPI(4);
		r+=2;
		printAreas(new Circle(r));
		r=5;
		printAreas(new Circle(r));
	}

	public static void printAreas(Circle c) {
		System.out.println("r=" + c.getRadius() + " area:" + c.getArea());
	}
}
