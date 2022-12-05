package lab2;

public interface Animal {
    public default String getMessage(){
        return "I love my pet!";
    }
    public String getBreed();
    public String getSound();
    public int getAge();
    public String getName();
    public void setName(String name);
}
