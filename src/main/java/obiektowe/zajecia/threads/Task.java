package obiektowe.zajecia.threads;

public class Task implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            System.out.println("Pisze z Klasy, numer iteracji: "+i);
        }
    }
}
