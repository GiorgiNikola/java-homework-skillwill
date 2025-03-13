package src.animal;

public class Animal {
    private String name;
    private int age;
    private String color;
    private String gender;
    private int weight;

    public Animal() {
    }

    public Animal(String name, int age, String color, String gender, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
