package lab1.question5;


public class Circle extends Shape{

    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public String toString() {
        return "A Circle with radius= " + getRadius() + " which is a subclass of " + super.toString();
    }

    public double getArea(){
        return Math.PI * getRadius() * getRadius();
    }

    public double getPerimeter(){
        return 2 * Math.PI * getRadius();
    }
}
