package obiektowe.zajecia.threads;

public class MyTask implements Runnable {

    private boolean running = true;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                if (!running) {
                    break;
                }
                Thread.sleep(2000);
                System.out.println("Tick");

            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
