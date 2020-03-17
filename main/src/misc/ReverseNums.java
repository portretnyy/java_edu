package misc;

public class ReverseNums {


    //{1,4,-1,6} -> {6,-1,4,1}
    public static int reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                System.out.println("This array is not a palindrome.");
                return 0;
            }
        }
        System.out.println("This array is a palindrome.");
        return 0;
    }
    // Решение можно реализовать и с помощью void метода, просто тренируюсь расставлять оператор return

    public static void main(String[] args) {
        int[] x = {1,1,3,3,1,1,};
        reverse(x);
    }
}
