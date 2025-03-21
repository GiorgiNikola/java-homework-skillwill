package src.main;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];
        words[0] = "Giorgi";
        words[1] = "Nikolozi";
        words[2] = "Luka";
        words[3] = "Dato";
        words[4] = "Ana";
        words[5] = "Erekle";
        words[6] = "Nino";
        words[7] = "Ucha";
        words[8] = "Demetre";
        words[9] = "Lazare";
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println();

        int[] numbers = {3,65,124,52,12515,2135,543};

        printIndex(numbers, 52);
        printIndex(numbers, 6224);
    }

    public static void printIndex(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                System.out.println("ინდექსი: " + i);
                return;
            }
        }
        System.out.println("ვერ ვიპოვე");
    }
}
