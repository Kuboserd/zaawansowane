package obiektowe.zajecia.functional.programing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Zad30 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }

        System.out.println();
        list.stream()
                .sorted((number1, number2) -> number2 - number1)
                .forEach(number -> System.out.print(number + " "));
        System.out.println();

        long count = list.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(count);

        List<Integer> newList = list.stream()
                .filter(number->number<50)
                .toList();
        for (Integer i: newList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Optional<Integer> soughtNumber = list.stream()
                .sorted((number1, number2) -> number2 - number1)
                .findFirst();
        System.out.println(soughtNumber);
        System.out.println();
    }
}
