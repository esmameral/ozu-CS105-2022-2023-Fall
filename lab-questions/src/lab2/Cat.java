package lab2;

public class Cat implements Animal{

    String breed, name, sound;
    int age;

    public Cat(String breed, String name, String sound, int age) {
        this.breed = breed;
        this.name = name;
        this.sound = sound;
        this.age = age;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is " + getName() + " , age is " + getAge() + " with sound " + getSound() + ". My breed is " + getBreed();
    }
}
