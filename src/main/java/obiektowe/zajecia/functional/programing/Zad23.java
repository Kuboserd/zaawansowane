package obiektowe.zajecia.functional.programing;

import java.util.Comparator;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Zad23 {
    public static void main(String[] args) {

        Predicate<String> predicate = x -> x.length() >= 5;
        Supplier<Integer> supplier = () -> new Random().nextInt(10);
        Comparator<String> comparator = (text1, text2) -> {
            if (text1.length() == text2.length()) {
                return 1;
            } else {
                return 0;
            }
        };

        System.out.println(predicate.test("Konik"));
        System.out.println(supplier.get());
        System.out.println(1 == comparator.compare("Kaktus", "Dworek"));
    }
}

