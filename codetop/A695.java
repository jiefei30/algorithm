package codetop;

/**
 * @author Wangmingcan
 * @date 2021/12/8 20:19
 * @description
 */
public class A695 {
    public static void main(String[] args) {

    }

    class Solution {

        int res = 0;
        int cur = 0;

        public int maxAreaOfIsland(int[][] grid) {
            int res = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    cur = 0;
                    if (grid[i][j] == 1) {
                        dfs(grid, i, j);
                    }
                    res = Math.max(res, cur);
                }
            }
            return res;
        }

        public void dfs(int[][] grid, int x, int y) {
            grid[x][y] = 0;
            cur++;
            if (x < grid.length - 1 && grid[x+1][y] == 1) {
                dfs(grid, x+1, y);
            }
            if (x > 0 && grid[x-1][y] == 1) {
                dfs(grid, x-1, y);
            }
            if (y < grid[0].length - 1 && grid[x][y+1] == 1) {
                dfs(grid, x, y+1);
            }
            if (y > 0 && grid[x][y-1] == 1) {
                dfs(grid, x, y-1);
            }
        }
    }
}
