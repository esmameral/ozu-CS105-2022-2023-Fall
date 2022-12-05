package lab1.question5;

public class Demo_Q5 {
    public static void main(String[] args){
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("blue" ,false);

        System.out.println(shape1);
        System.out.println(shape2);

        Circle circle1 = new Circle(2.7);
        Circle circle2 = new Circle(3.8, "red", true);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println("Circle 1 area: " + circle1.getArea());

        Rectangle rect1 = new Rectangle(4, 8);
        Rectangle rect2 = new Rectangle(7, 10, "purple", false);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println("Rectangle_2 perimeter: " + rect2.getPerimeter());

        Square square1 = new Square(5);
        Square square2 = new Square(12, "black", true);

        System.out.println(square1);
        System.out.println(square2);

        square1.setLength(9);
        System.out.println("Square_1 width: " + square1.getWidth());
    }
}
