package misc;

import arrays.ArraysDemo;

public class ReverseNums {


    //{1,4,-1,6} -> {6,-1,4,1}
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] x = {1,5,6,3,11,44,7,66};
        reverse(x);
        ArraysDemo.printArray(x);
    }
}
