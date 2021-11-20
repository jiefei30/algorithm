package leetcode.algorithm.dp;

/**
 * @author Wangmingcan
 * @date 2021/11/20 16:41
 * @description 打家劫舍
 */
public class A198 {
    public static void main(String[] args) {

    }

    class Solution {
        public int rob(int[] nums) {
            int[] dp = new int[nums.length + 1];
            dp[1] = nums[0];
            for (int i = 2; i <= nums.length; i++) {
                dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
            }
            return dp[nums.length];
        }
    }
}
