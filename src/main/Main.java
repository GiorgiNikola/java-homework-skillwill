package src.main;

import src.animal.Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("Dogo");
        dog.setAge(4);
        dog.setColdBlooded(false);
        dog.setGender('M');
        dog.setWeight(30.24);

        System.out.println("Animal 1");
        printAnimal(dog);

        System.out.println();

        Animal cat = new Animal("Kata", 7, true, 'F', 20.6);

        System.out.println("Animal 2");
        printAnimal(cat);
    }

    private static void printAnimal(Animal animal) {
        System.out.println("Animal name: " + animal.getName());
        System.out.println("Animal age: " + animal.getAge());
        System.out.println("Is animal cold blooded: " + animal.isColdBlooded());
        System.out.println("Animal gender: " + animal.getGender());
        System.out.println("Animal weight: " + animal.getWeight());
    }
}
