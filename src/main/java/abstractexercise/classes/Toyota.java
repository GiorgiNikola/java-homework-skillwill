package src.main.java.abstractexercise.classes;

import src.main.java.abstractexercise.abstractclasses.Car;

public class Toyota extends Car {
    @Override
    public void speed() {
        System.out.println("Toyota's speed is 200 km/h");
    }

    @Override
    public void color() {
        System.out.println("Toyota's color is black");
    }
}
