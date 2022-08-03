package obiektowe.plik.part3.kolekcje.zad25;

public class ConcatenationTask implements Runnable {

    private int repeat;
    private char sign;
    private boolean runnning = true;
    private String result;

    @Override
    public void run() {
        String temp = "";
        for (int i = 0; i < repeat; i++) {
            if (!runnning) {
                break;
            }
            temp += sign;
        }
        result = temp;
    }

    public void startTask() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public void abort() {
        runnning = false;
    }

    public ConcatenationTask(int repeat, char sign) {
        this.repeat = repeat;
        this.sign = sign;
    }

    public String getResult() {
        return result;
    }

}
