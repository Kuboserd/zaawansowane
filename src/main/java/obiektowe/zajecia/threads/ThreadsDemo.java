package obiektowe.zajecia.threads;

public class ThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    System.out.println("Pisze z anonima, numer iteracji: " + i);
                }
            }
        };

        Thread worker = new Thread(task);
        Thread worker2 = new Thread(new Task());
        worker.start();
        worker2.start();

        worker.join();//bedzie stac i czekac az worker skonczy pracowac
        worker2.join();

        for (int i = 0; i < 10_000; i++) {
            System.out.println("Pisze z Maina, numer iteracji: "+i);
        }

    }
}
