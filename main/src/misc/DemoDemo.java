package misc;

import java.util.Objects;
import java.util.Vector;

public class DemoDemo {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = new String("test");
        String s3 = "test";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("************");
        System.out.println(s1 == s3);

        Struct t  = new Struct(1);
        test(t);

        System.out.println(t.data);

        String s = "abc";
        test(s);
        System.out.println(s);

        Object o = null;

        //o.hashCode();

        int[] a = {1,2};
        System.out.println(a.hashCode());
        a[1] = 3;
        System.out.println(a.hashCode());
    }

    private static void test(Struct t) {
//        t.data = t.data*2;
        t = new Struct(100);
    }

    private static void test(String s) {
        s = "et";
    }

    private  static class Struct {
        int data;

        public Struct(int data) {
            this.data = data;
        }
    }
}
