package src.main.java.interfaceexercise.main;

import src.main.java.interfaceexercise.classes.SomeClass;

public class InterfaceMain {
    public static void main(String[] args) {
        SomeClass someObject = new SomeClass();
        someObject.hello("hello, world");
        someObject.hello("hello, n times", 5);
    }
}
