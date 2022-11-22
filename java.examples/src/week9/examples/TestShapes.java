package week9.examples;

public class TestShapes {
	public static void main(String[] args) {
		Circle c=new Circle(4.5, "alinin dairesi");
		System.out.println(c.computeArea());
		Rectangle rec=new Rectangle(4.0, 5.0);
		System.out.println(rec.computeArea());
		
		System.out.println(c);
		System.out.println(rec);
	}



}
