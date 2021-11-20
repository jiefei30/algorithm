package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/20 10:37
 * @description 旋转图像
 *
 * 原地旋转：将矩形分为四块，两个for循环一块的量，但是每次swap四个块的坐标
 *
 */
public class A48 {
    public static void main(String[] args) {

    }

    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j < (n+1)/2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - j - 1][i];
                    matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                    matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                    matrix[j][n - i - 1] = temp;
                }
            }
        }
    }
}
