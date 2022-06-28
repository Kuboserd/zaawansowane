package obiektowe.plik.linia;

public class Prostokat {
    int height;
    int width;
    char fillling;

    public Prostokat(int height, int width, char fillling) {
        this.height = height;
        this.width = width;
        this.fillling = fillling;
    }

    void printRectangle() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.fillling);
            }
            System.out.println();
        }
    }
}
