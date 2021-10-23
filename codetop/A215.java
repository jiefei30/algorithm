package codetop;

/**
 * @author Wangmingcan
 * @date 2021/8/24 17:04
 * @description 数组中的第K个最大元素 （快排/堆排）
 */
public class A215 {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(new Solution().findKthLargest(arr, 1));
    }

    static class Solution {
        public int findKthLargest(int[] nums, int k) {
            int round = 0;
            if (k <= nums.length) {
                for(int i =0 ; i<nums.length-1 ; i++) {
                    for(int j=0 ; j<nums.length-1-i ; j++) {
                        if(nums[j]>nums[j+1]) {
                            int temp = nums[j];
                            nums[j]=nums[j+1];
                            nums[j+1]=temp;
                        }
                    }
                    if (k == ++round) {
                        return nums[nums.length - k];
                    }
                }
            }else {
                k = nums.length+1-k;
                for(int i =0 ; i<nums.length-1 ; i++) {
                    for(int j=0 ; j<nums.length-1-i ; j++) {
                        if(nums[j]<nums[j+1]) {
                            int temp = nums[j];
                            nums[j]=nums[j+1];
                            nums[j+1]=temp;
                        }
                    }
                    if (k == ++round) {
                        return nums[nums.length - k];
                    }
                }
            }
            return nums[0];
        }
    }
}