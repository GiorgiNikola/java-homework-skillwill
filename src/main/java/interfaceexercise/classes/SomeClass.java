package src.main.java.interfaceexercise.classes;

import src.main.java.interfaceexercise.interfaces.SomeInterface;

public class SomeClass implements SomeInterface {
    @Override
    public void hello(String message) {
        System.out.println(message);
    }

    @Override
    public void hello(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
