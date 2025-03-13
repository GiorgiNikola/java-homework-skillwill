package src.main;

import src.animal.Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("Dogo");
        dog.setAge(4);
        dog.setColor("Black");
        dog.setGender("Male");
        dog.setWeight(30);

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());
        System.out.println(dog.getGender());
        System.out.println(dog.getWeight());

        System.out.println();

        Animal cat = new Animal("Kata", 7, "White", "Female", 20);

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        System.out.println(cat.getGender());
        System.out.println(cat.getWeight());
    }
}
