package src.animal;

public class Animal {
    private String name;
    private int age;
    private boolean isColdBlooded;
    private char gender;
    private double weight;

    public Animal() {
    }

    public Animal(String name, int age, boolean isColdBlooded, char gender, double weight) {
        this.name = name;
        this.age = age;
        this.isColdBlooded = isColdBlooded;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isColdBlooded() {
        return isColdBlooded;
    }

    public void setColdBlooded(boolean coldBlooded) {
        isColdBlooded = coldBlooded;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
