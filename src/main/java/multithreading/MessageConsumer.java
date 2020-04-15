package multithreading;

public class MessageConsumer extends Thread {
    private MessageBox box;
    private int cnt = 0;

    public MessageConsumer(MessageBox box) {
        this.box = box;
    }

    public int getCnt() {
        return cnt;
    }

    private void printMessage(String message) {
        cnt++;
        System.out.println(message);
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            synchronized (box) {
                if (box.getMessage() != null) {
                    printMessage(box.getMessage());
                    box.setMessage(null);
                }
            }

            try {
                synchronized (this) {
                    this.wait(0,100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
