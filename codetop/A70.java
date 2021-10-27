package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/27 15:51
 * @description 爬楼梯
 */
public class A70 {
    public static void main(String[] args) {

    }

    class Solution {
        public int climbStairs(int n) {
            if (n == 1) {
                return 1;
            }
            int[] dp = new int[3];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[2] = dp[0] + dp[1];
                dp[0] = dp[1];
                dp[1] = dp[2];
            }
            return dp[2];
        }
    }
}
