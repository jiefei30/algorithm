package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/12 15:37
 * @description 缺失的第一个正数
 * （使用数组自身的哈希性质）
 */
public class A41 {
    public static void main(String[] args) {

    }

    class Solution {
        public int firstMissingPositive(int[] nums) {
            int l = nums.length;
            for (int i = 0; i < l; i++) {
                if (nums[i] <= 0) {
                    nums[i] = l+1;
                }
            }
            for (int i = 0; i < l; i++) {
                int temp = Math.abs(nums[i]);
                if (temp <= l) {
                    nums[temp-1] = -Math.abs(nums[temp-1]);
                }
            }
            for (int i = 0; i < l; i++) {
                if (nums[i] > 0) {
                    return i+1;
                }
            }
            return l+1;
        }
    }
}
