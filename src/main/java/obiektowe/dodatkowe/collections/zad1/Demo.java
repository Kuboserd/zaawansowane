package obiektowe.dodatkowe.collections.zad1;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new SDAArrayList<>();
        list.add(0,12);
        ((SDAArrayList<?>) list).display();
        list.remove(0);
        ((SDAArrayList<?>) list).display();
    }
}
