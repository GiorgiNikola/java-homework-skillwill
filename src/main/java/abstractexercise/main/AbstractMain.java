package src.main.java.abstractexercise.main;

import src.main.java.abstractexercise.abstractclasses.Car;
import src.main.java.abstractexercise.classes.Hyundai;
import src.main.java.abstractexercise.classes.Lamborghini;
import src.main.java.abstractexercise.classes.Toyota;

public class AbstractMain {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Hyundai hyundai = new Hyundai();

        // to show upcasting
        Car lamborghini = new Lamborghini();

        toyota.color();
        toyota.speed();
        toyota.wheelCount();

        hyundai.color();
        hyundai.speed();
        toyota.wheelCount();

        lamborghini.color();
        lamborghini.speed();
        toyota.wheelCount();
    }
}
