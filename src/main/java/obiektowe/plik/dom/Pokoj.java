package obiektowe.plik.dom;

import java.util.Arrays;

public class Pokoj {
    Lozko bed;
    Okno[] windows;

    public Pokoj() {
        this.bed = new Lozko(5);
        this.windows = new Okno[]{new Okno(), new Okno()};
    }

    public Pokoj(Lozko bed, Okno[] windows) {
        this.bed = bed;
        this.windows = windows;
    }

    public void tidy() {
        bed.changeBedclothes();
        for (Okno x : windows) {
            if (!x.isOpen()) {
                x.interact();
            }
        }
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "bed=" + bed +
                ", windows=" + Arrays.toString(windows) +
                '}';
    }
}
