package src.main.java.abstractexercise.classes;

import src.main.java.abstractexercise.abstractclasses.Car;

public class Lamborghini extends Car {
    @Override
    public void speed() {
        System.out.println("Lamborghini's speed is 300 km/h");
    }

    @Override
    public void color() {
        System.out.println("Lamborghini's color is yellow");
    }
}
