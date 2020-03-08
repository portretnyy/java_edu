package arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = {12,13,415,74,-1,45,42};

        int sum = 0;//sum of all elements of array
        for (int i = 0; i < array.length; i++) {
            sum += array[i];//sum = sum + array[i];
        }
    }
}
