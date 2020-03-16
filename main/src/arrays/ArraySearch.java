package arrays;

public class ArraySearch {

    //given sorted array of ints
    // need find value n in this array, and return index of this value if value doesn't exist then return -1

    public static int findNaiveValue(int value, int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                index = i;
            }
        }
        return index;
    }

    /* read about binary search
    public static int findBSValue(int value, int[] arr) {
        int index = 0;
        for (int i = arr.length / 2; i > 0; i /= 2) {
            if (value == arr[i]) {
                index = i;
            }
        }
        return index;
    }
    */
    //O(t)

    public static int findBSValue(int[] arr, int value) {
        return -1;
    }

    public static void main(String[] args) {
        int[] x = {1,3,8,21,34,55};
        System.out.println(findNaiveValue(55, x));
    }
}
