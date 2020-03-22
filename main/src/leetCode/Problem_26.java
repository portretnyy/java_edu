package leetCode;

import arrays.ArraysDemo;

public class Problem_26 {

    public static int removeDuplicates (int arr[]) {
        //[1,2,2,4,15,15,16]->[1,2,4,15,16,0,0]
        int result = 0;
        if (arr.length == 1) {
            result = 1;
            return result;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                if (arr[j] == arr[j + 1]) {
                    arr[j + 1] = arr[j + 2];
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result = i + 1;
                ArraysDemo.printArray(arr);
                return result;
            }
        }
        return 0;
    }



    public static void main(String[] args) {
        int[] array = {1,2};
        System.out.println(removeDuplicates(array));
    }
}
