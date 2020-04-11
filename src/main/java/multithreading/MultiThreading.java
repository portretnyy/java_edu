package multithreading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiThreading {

    static int from = 1;
    static int to = 1_000_000;
    static int step = 1;

    public static void main(String[] args) throws InterruptedException {
        calc1Thread();

        calc4Threads();

        calcNThreads(3);
    }
    public static void calc1Thread() {
        //Thread  - поток исполнения
        //Stream - поток данных
        long startTime = System.nanoTime();
        System.out.println("calc1Thread = " + sum(1,100_000_000, 1));
        long endTime = System.nanoTime();

        System.out.println("computation took " + (endTime - startTime) + " nanoseconds");
    }

    public static void calc4Threads() throws InterruptedException{
        long startTime = System.nanoTime();
        SumThread sumThread1 = new SumThread(1, 25_000_000, 1);
        SumThread sumThread2 = new SumThread(25_000_001, 50_000_000, 1);
        SumThread sumThread3 = new SumThread(50_000_001, 75_000_000, 1);
        SumThread sumThread4 = new SumThread(75_000_001, 100_000_000, 1);
        //1 .. n  = n(n+1)/2
        sumThread1.start();//creates new thread in OS and runs method "run" in that thread
        sumThread2.start();
        sumThread3.start();
        sumThread4.start();

        sumThread1.join();//thread main waits
        sumThread2.join();
        sumThread3.join();
        sumThread4.join();

        long sum = 0;
        sum += sumThread1.getResult();
        sum += sumThread2.getResult();
        sum += sumThread3.getResult();
        sum += sumThread4.getResult();

        System.out.println("calc4Threads= " + sum);
        long endTime = System.nanoTime();

        System.out.println("computation took " + (endTime - startTime) + " nanoseconds");
    }

    public static void calcNThreads(int n) {
        int difference;
        long sum = 0;
        List<SumThread> threads = new ArrayList<>();
        difference = to / n;
        to = difference;
        for (int i = 1; i <= n; i++) {
            threads.add(i - 1, new SumThread(from, to, step));
            from += difference;
            to += difference;
        }
        for (SumThread thread: threads) {
            thread.start();
        }
        for (int i = 0; i < threads.size(); i++) {
            sum += threads.get(i).getResult();
        }
        System.out.println(sum);
    }

    //1 .. 1000 in 1 thread
    //1 .. 500 in 1st thread
    //501 ... 1000 in 2nd thread
    // sum results from first thread and second thread
    public static long sum(int from, int to, int step){
        long sum = 0;
        for (int i = from; i <= to; i+=step) {
            sum += i;
        }

        return sum;
    }
}
