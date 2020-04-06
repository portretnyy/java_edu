package arrays;

public class ArraysMerge {

    public static void main(String[] args) {
        int[] x = {1,3,5,7,9,11};
        int[] y = {2,4,8,10,16};
        int[] ints = mergeArrays(x, y);
        int[] ints1 = mergeArrayWithSorted(x, y);
        ArraysDemo.printArray(ints);
        ArraysDemo.printArray(ints1);

    }

    public static int[] mergeArrays(int[]arr0, int[] arr1) {
        int[] merged = new int[arr0.length + arr1.length];
        for (int i = 0; i < merged.length; i++) {
            if (i < arr0.length) {
                merged[i] = arr0[i];
            } else {
                merged[i] = arr1[i - arr0.length];
            }
        }
        return merged;
    }

    // Does not work
    public static int[] mergeArrayWithSorted(int[] arr0, int[] arr1) {
        int[] merged = new int[arr0.length + arr1.length];
        for (int i = 0; i < merged.length; i++) {
            while (i < arr0.length)
                if (arr0[i] < arr1[i]) {
                    merged[i] = arr0[i];
                    merged[i + 1] = arr1[i];
                } else {
                    merged[i] = arr1[i];
                    merged[i + 1] = arr0[i];
                }
        }
        return merged;
    }
}
