package src;

public class Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 14;
        double num3 = 5;
        double num4 = 305;

        System.out.println(averageOfFourNumbers(num1, num2, num3, num4));

        double num5 = 52;
        double num6 = 3;
        double num7 = 3000;
        double num8 = 486;

        System.out.println(averageOfFourNumbers(num5, num6, num7, num8));

        String a = "something";
        String b = "anything";
        String c = "nothing";

        System.out.println(lengthOfThreeStrings(a, b, c));

        String d = "monday";
        String e = "tuesday";
        String f = "wednesday";

        System.out.println(lengthOfThreeStrings(d, e, f));
    }

    /*
    *  რადგან გვინდა საშუალოს გამოთვლა საჭიროა ისეთი დეითა ტაიპის
    *  გამოყენება რომელსაც მთელი ნაწილიც აქვს და წილადიც ამიტომ პარამეტრად გადავცემთ დაბლს
    * */
    public static double averageOfFourNumbers(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }

    // თითოეული სტრინგის სიგრძის გასაგებად ვიყენებთ ჩაშენებულ მეთოდს
    public static int lengthOfThreeStrings(String a, String b, String c) {
        return a.length() + b.length() + c.length();
    }
}
