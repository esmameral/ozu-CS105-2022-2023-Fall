package lab2;

public class Square extends Polygon{

    public Square(int[] sides) {
        super(sides);
        fillColor();
    }

    @Override
    public double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    public void fillColor() {
        String[] temp_colors = {"pink", "black", "green", "white"}; // default colors
        this.color = new Color(temp_colors);
    }

    @Override
    public void fillColorUser(String[] colors) {
        if(colors.length==4)
            this.color = new Color(colors);
    }

    @Override
    public String toString() {
        String temp =  "Perimeter: " + getPerimeter() + ", Area: " + getArea() + " Colors: ";
        for (String s: this.color.names)
            temp += s + ", " ;
        return temp;
    }
}
