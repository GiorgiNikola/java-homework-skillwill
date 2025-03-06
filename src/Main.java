package src;

public class Main {
    public static void main(String[] args) {
        // main exercise
        String dog = "dog";
        String cat = "cat";
        String lion = "lion";
        String pig = "pig";
        String chicken = "chicken";

        printAnimalName(dog);
        printAnimalName(cat);
        printAnimalName(lion);
        printAnimalName(pig);
        printAnimalName(chicken);

        System.out.println();

        int num1 = 2;
        int num2 = 3;
        int num3 = 4;

        System.out.println(power(num1, num2));
        System.out.println(power(num2, num3));
        System.out.println(power(num3, num3));
    }


    // the method gets animal name and prints its sentence
    public static void printAnimalName(String animalName) {
        if (animalName == "dog") {
            System.out.println("I am the dog");
        }else if (animalName == "cat") {
            System.out.println("I am the cat");
        }else if (animalName == "lion") {
            System.out.println("I am the lion");
        }else if (animalName == "pig") {
            System.out.println("I am the pig");
        }else {
            System.out.println("I am an animal");
        }
    }

    // power method, the method calculates: a to the power of b
    public static int power(int a, int b) {
        int answer = a;
        for (int i = 1; i < b; i++) {
            answer *= a;
        }
        return answer;
    }

    // bonus method factorial
    public static int factorial(int n) {
        int answer = 1;
        while (n > 0){
            answer *= n;
            n--;
        }
        return answer;
    }

    // bonus method fibonacci, the method calculates nth fibonacci number
    public static int fibonacci(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        if (n == 0) {
            return 0;
        }
        while (n > 1){
            int temp = secondNumber;
            secondNumber = firstNumber + secondNumber;
            firstNumber = temp;
            n--;
        }
        return secondNumber;
    }
}
