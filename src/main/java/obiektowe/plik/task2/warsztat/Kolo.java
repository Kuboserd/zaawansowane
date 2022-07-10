package obiektowe.plik.task2.warsztat;

public class Kolo {
    private float preassure;
    private boolean flatTire;

    public Kolo(float preassure, boolean flatTire) {
        this.preassure = preassure;
        this.flatTire = flatTire;
    }

    public Kolo() {
        this.flatTire = false;
        this.preassure = 50;
    }

    public void interact() {
        this.flatTire = !flatTire;
    }

    public boolean isFlat() {
        return flatTire;
    }
}
