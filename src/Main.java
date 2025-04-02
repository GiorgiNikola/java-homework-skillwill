package src;

public class Main {
    public static void main(String[] args) {
        int num = parseStringToInteger("724");
        int num1 = parseStringToInteger("5215");
        System.out.println(num);
        System.out.println(num1);

        Car car = new Car("Tesla", "Model 3", 2020, 4);
        Car car1 = new Car("Toyota", "Camry", 2021, 4);
        System.out.println(car);
        System.out.println(car1);
    }

    public static Integer parseStringToInteger(String input) {
        return Integer.parseInt(input);
    }


}
