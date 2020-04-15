package multithreading;

public class RunnableDemo {
    public static void main(String[] args) {
        int from = 1;
        int to = 100;
        Runnable arithmeticProgression = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = from; i <= to; i++) {
                    sum += i;
                }
                System.out.println(sum);
            }
        };

        Thread t = new Thread(arithmeticProgression);
        t.start();
        System.out.println("test");

        new Thread(
                () -> {
                    int sum = 0;
                    for (int i = from; i <= to; i++) {
                        sum += i;
                    }
                    System.out.println(sum);
                }
        ).start();
    }
}
