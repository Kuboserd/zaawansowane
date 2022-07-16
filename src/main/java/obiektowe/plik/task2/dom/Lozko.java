package obiektowe.plik.task2.dom;

public class Lozko {
    private int lastChangedBedclothes;

    public Lozko(int lastChangedBedclothes) {
        this.lastChangedBedclothes = lastChangedBedclothes;
    }

    public void changeBedclothes() {
        this.lastChangedBedclothes = 0;
    }

    @Override
    public String toString() {
        return "Lozko{" +
                "lastChangedBedclothes=" + lastChangedBedclothes +
                '}';
    }
}
