package leetcode.algorithm.dp;

/**
 * @author Wangmingcan
 * @date 2021/11/20 17:04
 * @description 删除并获得点数
 */
public class A740 {
    public static void main(String[] args) {

    }

    class Solution {
        public int deleteAndEarn(int[] nums) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
            }
            int[] sum = new int[max + 1];
            for (int i = 0; i < nums.length; i++) {
                sum[nums[i]] += nums[i];
            }
            return rob(sum);
        }

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
