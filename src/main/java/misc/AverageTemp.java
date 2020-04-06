package misc;
// Дано: массив целых чисел, каждое из которых - измеренная температура в определенный день месяца.
// Требуется: написать метод, возвращающий новый массив того же размера, каждый элемент которого -
// это средняя температура с начала и до соответствующего дня.

import arrays.ArraysDemo;

public class AverageTemp {

    public static double[] averageTemp(int[] arr) {
        double arr0[] = new double[arr.length];
        int sum = 0;
        double avr = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avr = (double) sum / (i + 1);
            arr0[i] = avr;
        }
        return arr0;
    }

    public static void main(String[] args) {
        int[] x = {3, 5, 6, 4, -1, -7};
        ArraysDemo.printArray(averageTemp(x));
    }
}
