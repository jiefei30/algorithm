package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/28 15:58
 * @description 最小路径和 dp
 */
public class A64 {
    public static void main(String[] args) {

    }

    class Solution {
        public int minPathSum(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            int[][] dp = new int[row][col];
            dp[0][0] = grid[0][0];
            for (int i = 1; i < row; i++) {
                dp[i][0] = dp[i-1][0] +  grid[i][0];
            }
            for (int i = 1; i < col; i++) {
                dp[0][i] = dp[0][i-1] +  grid[0][i];
            }
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < col; j++) {
                    dp[i][j] = grid[i][j] + Math.min(dp[i][j-1], dp[i-1][j]);
                }
            }
            return dp[row-1][col-1];
        }
    }
}
