package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/25 20:37
 * @description 接雨水
 */
public class A42 {
    public static void main(String[] args) {

    }

    class Solution {
        public int trap(int[] height) {
            int res = 0;
            int len = height.length;
            int[] left = new int[len];
            int[] right = new int[len];
            left[0] = height[0];
            for (int i = 1; i < len; i++) {
                left[i] = Math.max(left[i-1], height[i]);
            }
            right[len-1] = height[len-1];
            for (int i = len - 2; i >= 0; i--) {
                right[i] = Math.max(height[i], right[i+1]);
            }
            for (int i = 0; i < len; i++) {
                res += Math.min(left[i], right[i]) - height[i];
            }
            return res;
        }
    }
}
