package obiektowe.plik.dom;

public class Okno {
    private boolean isOpen;

    public Okno() {
        this.isOpen = false;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public void interact() {
        this.isOpen = !isOpen;
    }

    @Override
    public String toString() {
        return "Okno{" +
                "isOpen=" + isOpen +
                '}';
    }
}
