package obiektowe.plik.part3.kolekcje.zad25;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        ConcatenationTask task = new ConcatenationTask(1_000_000, 'F');

        task.startTask();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    task.abort();
                    System.out.println("Aborting task");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        thread.join();
        Thread.sleep(1000);
        System.out.println(task.getResult().length());
    }

}
