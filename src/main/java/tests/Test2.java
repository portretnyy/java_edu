package tests;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Map<int[], Integer> map = new HashMap<>();

        map.put(new int[1], 1);

        System.out.println(map.containsKey(new int[1]));


        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        System.out.println(map);
    }
    public static void main_(String... args) {
        for (int i = 0; i < 10 && args.length > 1; i++) {
            System.out.println(args[0]);
        }

        printAllMessages();
        printAllMessages("test");
        printAllMessages("test", "also test");
        int[] notEmptyArray = createNotEmptyArray(1);
        int[] notEmptyArray1 = createNotEmptyArray(1, 2, 3, 3);
    }

    public static void printAllMessages(String... messages) {//varargs
        //messages is String[]
        System.out.println("*".repeat(40));
        for (String message : messages) {
            System.out.println(message);
        }
    }

    //public static void doSomething(int ... x, int y) {}//vararg must be last paramater!

    public static int[] createNotEmptyArray(int firstValue, int... otherValues) {
        int[] result = new int[otherValues.length + 1];
        result[0] = firstValue;

        for (int i = 0; i < otherValues.length; i++) {
            result[i + 1] = otherValues[i];
        }
        return result;
    }

}
