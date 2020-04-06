package arrays;
// Дан массив целых чисел. Требуется преобразовать его так, чтобы каждый последующий элемент массива
// был суммой всех предыдущих. Без вложенных циклов. Без создания новых массивов.

public class SumOfElements {

/*    public static int[] sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            sum += arr[i-1];
            arr[i] = sum;
        }
        return arr;
    }

 */

    public static int sum(int arr[], int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += arr[i - 1];
        }
        return sum;
    }

    public static int[] sumOfElements(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = sum(arr, i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] x = {5, 3, 7, 66, 30, 3};
        sumOfElements(x);
        ArraysDemo.printArray(x);
    }
}
