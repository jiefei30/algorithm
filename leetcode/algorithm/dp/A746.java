package leetcode.algorithm.dp;

/**
 * @author Wangmingcan
 * @date 2021/11/19 14:41
 * @description 使用最小花费爬楼梯
 */
public class A746 {
    public static void main(String[] args) {

    }

    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int[] dp = new int[cost.length];
            dp[0] = cost[0];
            dp[1] = cost[1];
            for (int i = 2; i < cost.length; i++) {
                dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
            }
            return Math.min(dp[cost.length-1], dp[cost.length-2]);
        }
    }
}
