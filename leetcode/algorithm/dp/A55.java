package leetcode.algorithm.dp;

/**
 * @author Wangmingcan
 * @date 2021/11/23 9:31
 * @description 跳跃游戏
 */
public class A55 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean canJump(int[] nums) {
            int cur = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                cur--;
                nums[i] = Math.max(nums[i], cur);
                cur = nums[i];
                if (nums[i] == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
