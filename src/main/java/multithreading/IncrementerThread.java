package multithreading;

public class IncrementerThread extends Thread {
    private Race.Data data;
    private int howManyTimes;

    public IncrementerThread(Race.Data data, int howManyTimes) {
        this.data = data;
        this.howManyTimes = howManyTimes;
    }

    @Override
    public void run() {
        for (int i = 0; i < howManyTimes; i++) {
            synchronized (data){
                data.cnt++;
            }
        }
    }
}
