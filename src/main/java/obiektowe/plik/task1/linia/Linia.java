package obiektowe.plik.task1.linia;

public class Linia {
    private int length;
    private char filling;

    public Linia(int length, char filling) {
        this.length = length;
        this.filling = filling;
    }

    public Linia() {
    }

    void printLine() {
        for (int i = 0; i < this.length; i++) {
            System.out.print(this.filling);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Linia{" +
                "length=" + length +
                ", filling=" + filling +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public char getFilling() {
        return filling;
    }

    public void setFilling(char filling) {
        this.filling = filling;
    }
}

