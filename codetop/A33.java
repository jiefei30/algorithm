package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/26 10:54
 * @description 搜索旋转排序数组 （二分查找）
 */
public class A33 {
    public static void main(String[] args) {

    }

    class Solution {
        public int search(int[] nums, int target) {
            int res = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    res = i;
                    break;
                }
            }
            return res;
        }
    }
}
