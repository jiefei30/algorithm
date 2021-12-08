package codetop;

/**
 * @author Wangmingcan
 * @date 2021/12/7 16:22
 * @description 寻找峰值
 *
 * 二分变体
 */
public class A162 {
    public static void main(String[] args) {

    }

    class Solution {
        public int findPeakElement(int[] nums) {
            int l = 0, r = nums.length - 1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (nums[mid] < nums[mid + 1]) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
            return l;
        }
    }
}
