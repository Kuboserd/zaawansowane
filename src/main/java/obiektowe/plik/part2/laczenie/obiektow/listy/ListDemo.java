package obiektowe.plik.part2.laczenie.obiektow.listy;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("Marek");
        list.add("Karol");
        list.add("Henk");
        list.add("Krystyna");
        list.add("Kuba");

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println();
        System.out.println(list.get(0));
        System.out.println(

        );
        list.add(1, "Marcin");
        list.remove("Kuba");
        for (String x : list) {
            System.out.println(x);
        }

        list2.add("Paulina");
        list2.add("Lukasz");
        list2.addAll(list);
        System.out.println();
        for (String x : list2) {
            System.out.println(x.toUpperCase());
        }

        System.out.println();
        for (String x : list) {
            if (x.endsWith("a"))
                System.out.println(x);
        }
    }

}
