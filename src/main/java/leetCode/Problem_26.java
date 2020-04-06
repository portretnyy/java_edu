package leetCode;

public class Problem_26 {

    public static int removeDuplicates (int arr[]) {
        //[1,2,2,4,15,15,16]->[1,2,4,15,16,0,0]
        int index = 0;
        int current = arr[0];
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] != current) {
                index += 1;
                current = arr[i];
                arr[index] = current;
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] array = {1,2};
        System.out.println(removeDuplicates(array));
    }
}
