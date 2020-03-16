package leetCode;

// Accepted
// Дано - массив {2,7,11,15}, число 9.
// Написать алгоритм, который вернет массив, содержащий два индекса элементов,
// которые в сумме образуют число 9

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] x = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] + nums[i + 1] == target){
                int y = i + 1;
                x[0] = i;
                x[1] = y;
            }
        }
        return x;
    }
}
