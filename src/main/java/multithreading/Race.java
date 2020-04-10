package multithreading;

public class Race {
    public static void main(String[] args) {
        Data data = new Data();
        IncrementerThread inc1 = new IncrementerThread(data, 1_000_000);
        IncrementerThread inc2 = new IncrementerThread(data, 1_000_000);
        IncrementerThread inc3 = new IncrementerThread(data, 1_000_000);
//        inc1.run();
//        inc2.run();
//        inc3.run();

        inc1.start();
        inc2.start();
        inc3.start();

        try {
//            inc1.join();
            inc2.join();
            inc3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("data.cnt = " + data.cnt);
    }

    public static class Data {
        public int cnt = 0;
    }
}
