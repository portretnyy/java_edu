package arrays;

public class arrSortHomework {

    public static void main(String[] args) {
        int[] arr0 = new int[]{1, 5, 86, 3, 8};
        for (int num : arr0) {
            System.out.print(num + ";\n++++++++++++++++\n");
        for (int i = 0; i < arr0.length; i++) {
            for (int j = 0; j < arr0.length - 1; j++) {
                if (arr0[j] > arr0[j + 1]) {
                    int temp = arr0[j + 1];
                    arr0[j + 1] = arr0[j];
                    arr0[j] = temp;
                }
                for (int k : arr0) {
                    System.out.println(num + ";");
                }
            }
            System.out.println("--------------");
        }

        }
    }
}
