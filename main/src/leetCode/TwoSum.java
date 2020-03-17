package leetCode;

// Accepted
// Дано - массив {2,7,11,15}, число 9.
// {1,2,3} [1,2], [2,3], [1,3]
// {1,2,3,4} [1,2] [2,3] [3,4] [1,4] [1,3] [2,4]
// Написать алгоритм, который вернет массив, содержащий два индекса элементов,
// которые в сумме образуют число 9

/*
// Ниже представлен алгоритм, который обходит все возможные пары внутри массива
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] x = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j) {
                    System.out.println("i = " + i + "\tj = " + j);
                }
            }
        }
        return x;
    }
}
*/

import arrays.ArraysDemo;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] x = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    x[0] = i;
                    x[1] = j;
                }
            }
        }
        ArraysDemo.printArray(x);
        return x;
    }

    public static void main(String[] args) {
        new TwoSum().twoSum(new int[]{1,2,3,4,5,8}, 12);
    }
}

// Дополнительное условие оператора if(i != j) добавлено потому, что при его отсутствии
// оператор return может вернуть два одинаковых индекса.
// Так, например, при nums = {3,3}, target = 6, нам будет возвращен массив x = {1,1}
// leetCode категорически не согласен с таким подходом