package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/23 10:49
 * @description 岛屿数量
 */
public class A200 {
    public static void main(String[] args) {

    }

    class Solution {
        public int numIslands(char[][] grid) {
            int res = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        res++;
                        dfs(grid, i, j);
                    }
                }
            }
            return res;
        }

        public void dfs(char[][] grid, int x, int y) {
            grid[x][y] = '0';
            if (x < grid.length - 1 && grid[x+1][y] == '1') {
                dfs(grid, x+1, y);
            }
            if (x > 0 && grid[x-1][y] == '1') {
                dfs(grid, x-1, y);
            }
            if (y < grid[0].length - 1 && grid[x][y+1] == '1') {
                dfs(grid, x, y+1);
            }
            if (y > 0 && grid[x][y-1] == '1') {
                dfs(grid, x, y-1);
            }
        }
    }
}
