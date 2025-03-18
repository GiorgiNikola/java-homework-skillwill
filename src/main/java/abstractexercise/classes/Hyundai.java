package src.main.java.abstractexercise.classes;

import src.main.java.abstractexercise.abstractclasses.Car;

public class Hyundai extends Car {

    @Override
    public void speed() {
        System.out.println("Hyundai's speed is 150 km/h");
    }

    @Override
    public void color() {
        System.out.println("Hyundai's color is pink");
    }
}
