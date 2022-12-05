package lab2;

public abstract class Polygon {
    Color color;
    int[] sides;

    public Polygon(int[] sides) {
        this.sides = sides;
    }

    public int getPerimeter(){
        int result = 0;
        for(int side:sides)
            result += side;
        return result;
    }

    public abstract double getArea();
    public abstract void fillColor();
    public abstract void fillColorUser(String[] colors);



}
