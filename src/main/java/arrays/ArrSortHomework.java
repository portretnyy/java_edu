package arrays;

public class ArrSortHomework {

    public static void main(String[] args) {
        int[] arr0 = {100, 99, 95, 90, 30, 1, 0, -8};
        ArraysDemo.printArray(arr0);
        for (int i = 0; i < arr0.length; i++) {
            for (int j = 0; j < arr0.length -  1 - i; j++) {
                if (arr0[j] > arr0[j + 1]) {
                    int temp = arr0[j + 1];
                    arr0[j + 1] = arr0[j];
                    arr0[j] = temp;
                }
                ArraysDemo.printArray(arr0);
            }
            System.out.println("\n--------------");
        }

        ArraysDemo.printArray(arr0);
    }
}
