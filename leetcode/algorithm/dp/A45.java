package leetcode.algorithm.dp;

/**
 * @author Wangmingcan
 * @date 2021/11/23 9:41
 * @description 跳跃游戏 II
 */
public class A45 {
    public static void main(String[] args) {
        
    }

    class Solution {
        public int jump(int[] nums) {
            int res = 0, maxPosition = 0, end = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                maxPosition = Math.max(maxPosition, i + nums[i]);
                if (i == end) {
                    end = maxPosition;
                    res++;
                }
            }
            return res;
        }
    }
}
