package arrays;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fib(50));
        String s = "test";
        int x = 50;//int
        long l = 50; //int
        int i = (int) 5_000_000_000L;
        int bin = 0b1010;
        int hex = 0xABC;
        System.out.println(bin + " " + hex);
        System.out.println("i = " + i);
        f(50L);
        System.out.println(50 == 50L);
    }

    /**
     * fib(1) = 1
     * fib(2) = 1
     * fib(3) = 2
     * fib(4) = 3
     * fib(n+1) = fib(n) + fib(n-1);
     * fib(n) = fib(n-1) + fib(n-2);
     * .....
     *
     * fib(3) = fib(2) + fib(1) = 1+ 1= 2;
     * fib(5) = fib(4) + fib(3) = fib(3) + fib(2) + fib(3) = 5;
     * ...
     */
    public static long fib(int n) {
        if (n == 1 || n == 2 ) {
            return 1L;
        } else {
            return fib(n -1) + fib(n -2);
        }
    }

    public static void f(byte b) {
        System.out.println("I am byte");
    }
    public static void f(int x) {
        System.out.println("I am int");
    }

    public static void f(long x) {
        System.out.println("I am long");
    }
}
