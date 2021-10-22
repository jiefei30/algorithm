package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/20 20:24
 * @description 合并两个有序数组 （双指针从尾部开始）
 */
public class A88 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,0,0,0};
        new Solution().merge(arr, 3, new int[]{2,5,6}, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int n1 = m -1;
            int n2 = n -1;
            while (n2 >= 0) {
                if (n1 >= 0 && nums1[n1] >= nums2[n2]) {
                    nums1[n1+n2+1] = nums1[n1];
                    n1--;
                }else {
                    nums1[n1+n2+1] = nums2[n2];
                    n2--;
                }
            }
        }
    }
}
