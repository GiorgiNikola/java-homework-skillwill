package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("Kotlin");
        stringList.add("Ruby");
        stringList.add("Ocaml");
        stringList.add("JavaScript");
        stringList.add("C#");
        stringList.add("PHP");
        stringList.add("Cobol");

        for (String word : stringList) {
            System.out.println(word);
        }
        System.out.println();

        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(7);
        listA.add(4);
        listA.add(5);

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(8);
        listB.add(3);
        listB.add(5);

        System.out.println("The maximum is: " + listsMax(listA, listB));
    }

    public static int listsMax(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int max = Integer.MIN_VALUE;
        for (Integer integer : list1) {
            if (integer > max) {
                max = integer;
            }
        }
        for (Integer integer : list2) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }
}
