package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/18 19:51
 * @description 最长有效括号
 */
public class A32 {
    public static void main(String[] args) {
        new Solution().longestValidParentheses("()(())");
    }

    static class Solution {
        public int longestValidParentheses(String s) {
            int len = s.length();
            if (len <= 1) {
                return 0;
            }
            int res = 0;
            int[] dp = new int[len];
            dp[0] = 0;
            for (int i = 1; i < len; i++) {
                if (s.charAt(i) == ')' && i - dp[i-1] > 0 && s.charAt(i - dp[i-1] -1) == '(') {
                    dp[i] += (2 + dp[i-1]);
                    if (i - dp[i-1]  > 1) {
                        dp[i] += dp[i - dp[i-1] - 2];
                    }
                    res = Math.max(res, dp[i]);
                }
            }
            return res;
        }
    }
}
