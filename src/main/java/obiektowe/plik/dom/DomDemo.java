package obiektowe.plik.dom;

import java.util.Arrays;

public class DomDemo {
    public static void main(String[] args) {

        Dom dom = new Dom(
                new Pokoj[]{new Pokoj(), new Pokoj(new Lozko(15), new Okno[]{new Okno(), new Okno(), new Okno(), new Okno()})}
        );
        System.out.println(dom);
    }
}