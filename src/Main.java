package src;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.println(commonElements(set1, set2));

        List<Car> cars2010 = new ArrayList<>();
        cars2010.add(new Car("Toyota", "Camry"));
        cars2010.add(new Car("Honda", "Accord"));
        cars2010.add(new Car("Ford", "Fusion"));


        List<Car> cars2015 = new ArrayList<>();
        cars2015.add(new Car("BMW", "X5"));
        cars2015.add(new Car("Audi", "A4"));

        List<Car> cars2020 = new ArrayList<>();
        cars2020.add(new Car("Tesla", "Model 3"));
        cars2020.add(new Car("Hyundai", "Elantra"));
        cars2020.add(new Car("Kia", "Sorento"));
        cars2020.add(new Car("Mercedes", "C-Class"));

        List<Car> cars2023 = new ArrayList<>();
        cars2023.add(new Car("Porsche", "911"));
        cars2023.add(new Car("Ferrari", "F8"));
        cars2023.add(new Car("Lamborghini", "Huracan"));
        cars2023.add(new Car("McLaren", "720S"));
        cars2023.add(new Car("Bugatti", "Chiron"));

        Map<Integer, List<Car>> carsMap = new HashMap<>();
        carsMap.put(2010, cars2010);
        carsMap.put(2015, cars2015);
        carsMap.put(2020, cars2020);
        carsMap.put(2023, cars2023);

        System.out.println(mostCarsReleasedYear(carsMap));
        System.out.println(mostCarsReleasedYear2(carsMap));
    }

    public static Set<Integer> commonElements(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<Integer>();
        for (Integer i : set1) {
            if (set2.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static int mostCarsReleasedYear(Map<Integer, List<Car>> carMap) {
        int year = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, List<Car>> entry : carMap.entrySet()) {
            int count = entry.getValue().size();
            if (count > maxCount) {
                maxCount = count;
                year = entry.getKey();
            }
        }
        return year;
    }

    // this time with streams much easier
    public static int mostCarsReleasedYear2(Map<Integer, List<Car>> carMap) {
        return carMap.entrySet().stream()
                .max(Comparator.comparingInt(entry -> entry.getValue().size()))
                .get()
                .getKey();
    }
}
