package codetop;

/**
 * @author Wangmingcan
 * @date 2021/12/7 14:42
 * @description 搜索二维矩阵 II
 */
public class A240 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int row = 0;
            int col = matrix[0].length - 1;
            while (col >= 0 && row < matrix.length) {
                if (matrix[row][col] == target) {
                    return true;
                }
                if (target < matrix[row][col]) {
                    col--;
                }else {
                    row++;
                }
            }
            return false;
        }
    }
}
