package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/16 10:55
 * @description 最大子序和
 */
public class A53 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Solution53().maxSubArray(nums));
    }
}

class Solution53 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0) {
                nums[i]+=nums[i-1];
            }
            res = res > nums[i] ? res:nums[i];
        }
        return res;
    }
}
