package arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 0, y = 1;
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            sum = x + y;
            System.out.print(sum + "; ");
            x = y;
            y = sum;
        }
    }

    /**
     * fib(1) = 1
     * fib(2) = 1
     * fib(3) = 2
     * fib(4) = 3
     * .....
     */
    public static int fib(int idx) {
        return 0;
    }
}