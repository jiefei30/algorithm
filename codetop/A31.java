package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/4 17:11
 * @description 下一个排列
 */
public class A31 {
    public static void main(String[] args) {
    }

    class Solution {
        public void nextPermutation(int[] nums) {
            int i = nums.length - 2;
            while (i >= 0 && nums[i] >= nums[i+1]) {
                i--;
            }
            if (i >= 0) {
                int j = nums.length - 1;
                while (j > i && nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums, i, j);
            }
            for (int x = i+1, y = nums.length-1; x < y;) {
                swap(nums, x, y);
                x++;
                y--;
            }
        }

        private void swap (int[] nums, int i, int j) {
            int swap = nums[i];
            nums[i] = nums[j];
            nums[j] = swap;
        }
    }
}
