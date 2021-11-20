package leetcode.algorithm.dp;

/**
 * @author Wangmingcan
 * @date 2021/11/20 16:49
 * @description 打家劫舍 II
 * 把数组划分成两个：
 * 1. 不偷第一家情况下的最大值
 * 2. 不偷最后一家情况下的最大值
 * 取最优解
 */
public class A213 {
    public static void main(String[] args) {

    }

    class Solution {
        public int rob(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            if (nums.length == 2) {
                return Math.max(nums[0], nums[1]);
            }
            return Math.max(rob(nums, true), rob(nums, false));
        }

        public int rob(int[] nums, boolean robLast) {
            int[] dp = new int[nums.length + 1];
            int end = nums.length - 1;
            dp[1] = nums[0];
            if (robLast) {
                dp[1] = 0;
                end = nums.length;
            }
            for (int i = 2; i <= end; i++) {
                dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
            }
            return dp[end];
        }
    }
}
