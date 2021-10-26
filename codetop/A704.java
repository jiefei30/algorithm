package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/26 14:44
 * @description 二分查找
 */
public class A704 {
    public static void main(String[] args) {

    }

    class Solution {
        public int search(int[] nums, int target) {
            int l = 0, r = nums.length-1, m;
            while (l <= r) {
                m = (r + l)/2;
                if (target == nums[m]) {
                    return m;
                }
                if (target > nums[m]) {
                    l = m + 1;
                }else {
                    r = m - 1;
                }
            }
            return -1;
        }
    }
}
