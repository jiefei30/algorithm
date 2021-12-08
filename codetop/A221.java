package codetop;

/**
 * @author Wangmingcan
 * @date 2021/12/7 15:19
 * @description 最大正方形
 *
 * 动态规划
 */
public class A221 {

    public static void main(String[] args) {

    }

    class Solution {
        public int maximalSquare(char[][] matrix) {
            int[][] dp = new int[matrix.length][matrix[0].length];
            int res = 0;
            for (int i = 0; i < matrix.length; i++) {
                dp[i][0] = matrix[i][0] - '0';
                res = Math.max(res, dp[i][0]);
            }
            for (int i = 0; i < matrix[0].length; i++) {
                dp[0][i] = matrix[0][i] - '0';
                res = Math.max(res, dp[0][i]);
            }
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    if (matrix[i][j] == '0') {
                        continue;
                    }
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j],dp[i][j-1])) + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
            return res*res;
        }
    }
}
