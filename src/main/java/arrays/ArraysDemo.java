package arrays;
import inheritance.Rectangle;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] x;
        int y[];//bad style
        int[] numbers = {1, 2, 3, 4, 5};//array of 4 numbers
        int[] otherNumbers = new int[6];//array of 6 numbers
        String[] strings = new String[3];//array of 3 null String
        String[] otherStrings = {"test", "test3", "hello"}; //array of 3 nonNull strings
//        printArray(new int[]{1,2,3,11,40});
//        System.out.println();
//        printArray(new String[]{"test", "123"});

//        System.out.println("numbers[5] = " + numbers[5]);//error!
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int i = 0;//bad codeStyle
        while (i < numbers.length) {
            System.out.println("* " + numbers[i]);
            i++;
        }

        for (int num : numbers) {
            //num === numbers[i]
            System.out.println("?" + num);
        }

        for (int number : numbers) {

        }

        for (int j = 0; j < numbers.length; j++) {

        }

        for (int k = numbers.length - 1; k >= 0; k--) {

        }

        int[] min = {55, 34,-241, 6, -99, 8, -1, -66, 5};
        System.out.println(getMinElementFromArray(min));


        Rectangle rectangle = new Rectangle(1,1);

    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "; ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + ", ");
        }
    }

    public static void printArray(double[] arr) {
        for (double i : arr) {
            System.out.print(i + "; ");
        }
        System.out.println();
    }

    public static int getMinElementFromArray(int[] arr) {
        int currMinElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < currMinElement) {
                currMinElement = arr[i];
            }
        }
        return currMinElement;
    }
}