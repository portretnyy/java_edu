package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraySearch {

    //given sorted array of ints
    // need find value n in this array, and return index of this value if value doesn't exist then return -1
    //O(t) = n
    public static int findNaiveValue(int value, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    // read about binary search

    @Deprecated
    public static int findBSValue(int value, int[] arr) {
        int index = 0;
        for (int i = arr.length / 2; i > 0; i /= 2) {
            if (value == arr[i]) {
                index = i;
            }
        }
        return index;
    }


    //log(n) - n - nlog(n) - n2 - n3 - n4 . ...... 2^n
    //O(t)

    //O(t) = log(n)
    public static int findBSValue(int[] arr, int value) {
        int begin = 0;
        int end = arr.length - 1;
        int middle = (begin + end)/2;

        while (end - begin > 1) {
            if (arr[middle] > value) {
                end = middle;
                middle = (begin + end) / 2;
            } else if (arr[middle] < value) {
                begin = middle;
                middle = (begin + end) / 2;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] x = {1,3,8,21,34,55};
        System.out.println(findNaiveValue(55, x));

        int[] arr = new int[1_000_000_000];
        Random random = new Random(12);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
//        Arrays.sort(arr);
        int val = random.nextInt();
        long time_begin = System.currentTimeMillis();
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());//time from unix epoch (01.01.1970)
        findNaiveValue(val, arr);
        long time_end = System.currentTimeMillis();
        System.out.println(time_end - time_begin);


        time_begin = System.currentTimeMillis();
        findBSValue(arr, val);
        time_end = System.currentTimeMillis();

        System.out.println(time_end - time_begin);


    }
}
