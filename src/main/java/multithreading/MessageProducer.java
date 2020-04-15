package multithreading;

import java.util.Random;

public class MessageProducer extends Thread {
    private MessageBox box;
    private static final Random random = new Random();
    private int cnt = 0;

    public MessageProducer(MessageBox box) {
        this.box = box;
    }

    private String generateMessage() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt()).append(";");
        }
        cnt++;
        return sb.toString();
    }

    public int getCnt() {
        return cnt;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            synchronized (box) {
                if (box.getMessage() == null) {
                    box.setMessage(generateMessage());
                }
            }

            try {
                synchronized (this) {
                    this.wait(0, 100);//wait up to 1000 msec
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
