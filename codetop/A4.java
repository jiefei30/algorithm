package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/8 21:26
 * @description 寻找两个正序数组的中位数
 * 合并两个有序数组，
 */
public class A4 {
    public static void main(String[] args) {
        System.out.println(5/2);
    }

    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int l1 = nums1.length;
            int l2 = nums2.length;
            int l3 = l1+l2;
            int[] arr = new int[l3];
            for (int i = 0; i < l1; i++) {
                arr[i] = nums1[i];
            }
            merge(arr, l1, nums2, l2);
            if (l3 % 2 == 1) {
                return arr[l3/2];
            }
            return ((float)(arr[l3/2-1]+arr[l3/2]))/2;
        }

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
