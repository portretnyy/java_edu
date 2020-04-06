package misc;

public class Recursion {
    public static void main(String[] args) {
        int factValue = fact_loop(4);
        System.out.println(factValue);
        factValue =  fact_recursive(10);
        System.out.println(factValue);
    }

    /**
     * ex 4! = 4*3*2*1 = 24
     * ex 10! = 10*9*8*7*6*5*4*3*2*1 = ...
     *  n! = n*(n-1)! if n > 1
     *  1! = 1
     * @param n values
     * @return fact of n
     */
    public static int fact_loop(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;//fact = fact * i;
        }
        return fact;
    }

    public static int fact_recursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact_recursive(n-1);
        }
    }
}
