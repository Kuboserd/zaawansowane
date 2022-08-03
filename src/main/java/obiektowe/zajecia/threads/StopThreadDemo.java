package obiektowe.zajecia.threads;

public class StopThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        MyTask task = new MyTask();
        Thread worker = new Thread(task);

        worker.start();
        Thread.sleep(3000);
//        task.setRunning(false);
        worker.interrupt();
    }
}
