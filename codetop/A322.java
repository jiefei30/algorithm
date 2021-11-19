package codetop;

import java.util.Arrays;

/**
 * @author Wangmingcan
 * @date 2021/11/18 20:09
 * @description 零钱兑换
 */
public class A322 {
    public static void main(String[] args) {

    }

    class Solution {
        public int coinChange(int[] coins, int amount) {
            if (amount == 0) {
                return 0;
            }
            int[] dp = new int[amount+1];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            for (int coin : coins) {
                for (int i = coin; i <= amount ; i++) {
                    if (dp[i - coin] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                    }
                }
            }
            return dp[amount] < Integer.MAX_VALUE ? dp[amount] : -1;
        }
    }
}
