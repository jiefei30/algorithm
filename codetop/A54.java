package codetop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/10/26 13:50
 * @description 螺旋矩阵
 */
public class A54 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            int left = 0 ,up = 0;
            int right = matrix[0].length - 1;
            int down = matrix.length - 1;
            int size = matrix.length * matrix[0].length;
            while (list.size() < size) {
                for (int i = left; i <= right; i++) {
                    if (list.size() < size) list.add(matrix[up][i]);
                }
                up++;
                for (int i = up; i <= down; i++) {
                    if (list.size() < size) list.add(matrix[i][right]);
                }
                right--;
                for (int i = right; i >= left; i--) {
                    if (list.size() < size) list.add(matrix[down][i]);
                }
                down--;
                for (int i = down; i >= up; i--) {
                    if (list.size() < size) list.add(matrix[i][left]);
                }
                left++;
            }
            return list;
        }
    }
}
