package arrays;

public class SortingDemo {
    public static void main(String[] args) {
        int[] arr = {78, 77, 46, 12, 3 ,6, -1};
        //after sorting-> arr == {-1,2,3,10,42,78}
//        ArraysDemo.printArray(arr);
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
        ArraysDemo.printArray(arr);
        System.out.println("++++++++++++");
        //n(n-1) operations
        //could be enhanced to n(n-1)/2
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                ArraysDemo.printArray(arr);
            }
            System.out.println("-------------------------");
        }
    }
}
