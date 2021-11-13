package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/13 10:08
 * @description 最长重复子数组
 * 1. 动态规划
 * 2. 滑动窗口
 */
public class A718 {
    public static void main(String[] args) {

    }

    class Solution {
        public int findLength(int[] nums1, int[] nums2) {
            int[][] dp = new int[nums1.length+1][nums2.length+1];
            for (int i = 1; i <= nums1.length ; i++) {
                for (int j = 1; j <= nums2.length; j++) {
                    if (nums1[i-1] == nums2[j-1]) {
                        dp[i][j] = 1 + dp[i-1][j-1];
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
            return dp[nums1.length][nums2.length];
        }
    }
}
