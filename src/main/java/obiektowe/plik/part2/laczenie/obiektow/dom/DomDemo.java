package obiektowe.plik.part2.laczenie.obiektow.dom;

public class DomDemo {
    public static void main(String[] args) {

        Dom dom = new Dom(
                new Pokoj[]{new Pokoj(), new Pokoj(new Lozko(15), new Okno[]{new Okno(), new Okno(), new Okno(), new Okno()})}
        );
        System.out.println(dom);
        dom.rooms[1].tidy();
        System.out.println(dom);
    }
}
