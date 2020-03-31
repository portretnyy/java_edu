package generics;

import arrays.ArraysDemo;

public class GenericDemo {
    public static void main(String[] args) {
        String[] strings = {"xyz","abs","abc", "ab"};
//        Comparable<String>[] comparables =  {"xyz","abs","abc", "ab"};
        sort(strings);
//        sort(comparables);
        ArraysDemo.printArray(strings);

        Apple apple = new Apple();
//        System.out.println(apple.compareTo(1));
    }

    public static void sort(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].compareTo(strings[j]) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
    }

    public static void sort(Apple[] apples) {
        for (int i = 0; i < apples.length; i++) {
            for (int j = i + 1; j < apples.length; j++) {
                if (apples[i].compareTo(apples[j]) > 0) {
                    Apple temp = apples[i];
                    apples[i] = apples[j];
                    apples[j] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Deprecated
    //never do it !
    public static void sort_dont_use(Comparable[] comparables) {
        for (int i = 0; i < comparables.length; i++) {
            for (int j = i + 1; j < comparables.length; j++) {
                if (comparables[i].compareTo(comparables[j]) > 0) {
                    Comparable temp = comparables[i];
                    comparables[i] = comparables[j];
                    comparables[j] = temp;
                }
            }
        }
    }

    public static class Apple implements Comparable<Apple> {
        @Override
        public int compareTo(Apple o) {
            return 0;
        }
    }

//    public static <T> boolean equals(DataHolder<T> dataHolder1, DataHolder<T> dataHolder2) {}
}
