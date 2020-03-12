package arrays;

public class ArraysMerge {

    public static void main(String[] args) {
        int[] x = {33, 56, 4, -6, 5};
        int[] y = {44, 3, 21, 56, 78, -5, 1};
        mergeArrays(x, y);
    }

    public static void mergeArrays(int[]arr0, int[] arr1) {
        int[]merged = new int[arr0.length + arr1.length];
        for (int i = 0; i < merged.length; i++) {
            if (i < arr0.length) {
                merged[i] = arr0[i];
            } else {
                merged[i] = arr1[i - arr0.length];
            }
        }
        ArraysDemo.printArray(merged);
    }
}
