package exceptions;

import javax.imageio.IIOException;
import java.io.IOException;

public class ExcDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("shown");
        int read = System.in.read();
        if (read > 70) {
            try {
                int x = 0;
                int[] arr = new int[0];
                arr[0] = 1;
//                throwException();
                System.out.println("not shown");
            }
            catch (Exception e) {
                System.out.println("exception occurred: + " + e.getMessage());
            }
            finally {
                System.out.println("finally block");
            }

        }
        System.out.println("read successful");
    }


    private static void throwException() throws Exception {
        throw new Exception();
    }


    private static void doSomething() {
        boolean x = true;
        /*

        code



         */
        if (x) {
            throw new RuntimeException("wrong x value");
        }


    }
}
