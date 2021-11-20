package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/20 14:30
 * @description 在排序数组中查找元素的第一个和最后一个位置
 *
 * 在使用二分查找第一次查找到目标值之后继续二分查找
 */
public class A34 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int leftIdx = binarySearch(nums, target, true);
            int rightIdx = binarySearch(nums, target, false) - 1;
            if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
                return new int[]{leftIdx, rightIdx};
            }
            return new int[]{-1, -1};
        }

        public int binarySearch(int[] nums, int target, boolean lower) {
            int left = 0, right = nums.length - 1, ans = nums.length;
            while (left <= right) {
                int mid = (left + right)/2;
                if (nums[mid] > target || (lower && nums[mid] >= target)) {
                    right = mid -1;
                    ans = mid;
                } else {
                    left = mid + 1;
                }
            }
            return ans;
        }
    }
}
