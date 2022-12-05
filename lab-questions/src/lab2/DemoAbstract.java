package lab2;

public class DemoAbstract {
    public static void main(String... args){
        Triangle t1 = new Triangle(new int[]{3, 4, 5});
        Square s1 = new Square(new int[]{7, 7, 7, 7});

//        int[] t2_sides = new int[3];
//        t2_sides[0] = 4;
//        t2_sides[1] = 1;
//        t2_sides[2] = 7;
//        Triangle t2 = new Triangle(t2_sides);


        System.out.println(t1);
        System.out.println(s1);

        t1.fillColorUser(new String[]{"white", "purple", "brown"});
        s1.fillColorUser(new String[]{"red", "red", "red", "red"});

        System.out.println(t1);
        System.out.println(s1);
    }
}
