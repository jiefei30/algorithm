package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/27 10:07
 * @description 寻找旋转排序数组中的最小值
 *  二分查找变种
 */
public class A153 {
    public static void main(String[] args) {

    }

    class Solution {
        public int findMin(int[] nums) {
            int l = 0;
            int h = nums.length - 1;
            while (l < h) {
                int mid = (l + h)/2;
                if (nums[mid] < nums[h]) {
                    h = mid;
                }else {
                    l = mid + 1;
                }
            }
            return nums[l];
        }
    }
}
