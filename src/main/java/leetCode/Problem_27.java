package leetCode;
import arrays.ArraysDemo;

public class Problem_27 {

    public static int removeValue (int arr[], int value) {
        ArraysDemo.printArray(arr);
        System.out.println("--------------------------");
        int result = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == value) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                result = j;
            }
            ArraysDemo.printArray(arr);
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int[] x = {1, 5, 5, 6, 10, 5, 3, 5, 7};
        removeValue(x, 5);
    }
}
