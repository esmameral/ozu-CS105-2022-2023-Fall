package lab2;

public class Triangle extends Polygon{
    public Triangle(int[] sides) {
        super(sides);
        fillColor();
    }

    @Override
    public double getArea() {
        int perimeter = getPerimeter();
        int result = perimeter * (perimeter-sides[0]) * (perimeter-sides[1]) * (perimeter-sides[2]);
        return Math.sqrt(result);
    }

    @Override
    public void fillColor() {
        String[] temp_colors = {"red", "blue", "yellow"};   //default colors
        this.color = new Color(temp_colors);
    }

    @Override
    public void fillColorUser(String[] colors) {
        if(colors.length==3)
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
