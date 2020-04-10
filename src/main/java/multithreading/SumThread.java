package multithreading;

public class SumThread extends Thread {
    private int from;
    private int to;
    private int step;
    private long result;

    public SumThread(int from, int to, int step) {
        this.from = from;
        this.to = to;
        this.step = step;
    }

    @Override
    public void run() {
        result = MultiThreading.sum(from,to,step);
    }

    public long getResult() {
        return result;
    }
}
