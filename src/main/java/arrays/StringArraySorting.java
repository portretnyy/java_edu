package arrays;

public class StringArraySorting {
    public static void main(String[] args) {
        String[] arr = {"zz", "zet", "abc", "test", "vat", "van", "vant"};//{"test", "abc", "aa" ,"aac", "zxc", "van"};
        String s1 = "aab";
        String s2 = "bbc";

        int comparisonResult = s1.compareTo(s2);//s1 < s2
        System.out.println(comparisonResult);
        //if result < 0 => s1 < s2
        //if result == 0 => s1 == s2
        //if result > 0 => s1 > s2
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) { //if (arr[i] > arr[i+1]) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            printArray(arr);
        }

    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + "; ");
        }
        System.out.println();
    }
}
