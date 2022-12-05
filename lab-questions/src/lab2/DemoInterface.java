package lab2;

public class DemoInterface {
    public static void main(String... args){
        Dog dog1 = new Dog("Golden", "dog1", "bark", 2);
        Dog dog2 = new Dog("Husky", "dog2", "bark", 3);
        Dog dog3 = new Dog("Labrador", "dog3", "bark", 1);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog1.getMessage());

        Cat cat1 = new Cat("Scottish", "cat1", "meow", 2);
        System.out.println(cat1);
        System.out.println(cat1.getMessage());
    }
}
