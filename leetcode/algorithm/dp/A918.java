package leetcode.algorithm.dp;

/**
 * @author Wangmingcan
 * @date 2021/11/24 9:16
 * @description 环形子数组的最大和
 */
public class A918 {
    public static void main(String[] args) {

    }

    class Solution {
        public int maxSubarraySumCircular(int[] nums) {
            int len = nums.length;
            int max = nums[0], dp = max, sum = max, min = 0;
            for (int i = 1; i < len; i++) {
                sum += nums[i];
                dp = nums[i] + Math.max(dp, 0);
                max = Math.max(max, dp);
            }
            for (int i = 1; i < len - 1; i++) {
                dp = nums[i] + Math.min(0, dp);
                min = Math.min(min, dp);
            }
            return Math.max(sum - min, max);
        }
    }
}
