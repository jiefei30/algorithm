package other.classicalAlgorithm;

import java.util.Random;

/**
 * @author Wangmingcan
 * @date 2021/11/15 21:04
 * @description
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,7,5,4,19,12,6,10};
        new Solution().QuickSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    static class Solution {
        public void QuickSort(int[] nums) {
            QSort(nums, 0, nums.length - 1);
        }

        public void QSort(int[] nums, int low, int high) {
            if (low < high) {
                int pivot = partition(nums, low, high);
                QSort(nums, low, pivot - 1);
                QSort(nums, pivot + 1, high);
            }
        }

        public int partition(int[] nums, int low, int high) {
            int pivot = nums[low];
            while (low < high) {
                while (low < high && nums[high] >= pivot) {
                    high--;
                }
                nums[low] = nums[high];
                while (low < high && nums[low] <= pivot) {
                    low++;
                }
                nums[high] = nums[low];
            }
            nums[low] = pivot;
            return low;
        }
    }

    class solution2 {
        public int[] sort(int[] nums) {
            randomizedQuicksort(nums, 0, nums.length - 1);
            return nums;
        }

        public void randomizedQuicksort(int[] nums, int l, int r) {
            if (l < r) {
                int pos = randomizePartition(nums, l, r);
                randomizedQuicksort(nums, l, pos -1);
                randomizedQuicksort(nums, pos + 1, r);
            }
        }

        public int randomizePartition(int[] nums, int l, int r) {
            int i = new Random().nextInt(r - l + 1) + l;
            swap(nums, r, i);
            return partition(nums, l, r);
        }

        public int partition(int[] nums, int l, int r) {
            int pivot = nums[r];
            int i = l - 1;
            for (int j = l; j <= r - 1; j++) {
                if (nums[j] <= pivot) {
                    i++;
                    swap(nums, i, j);
                }
            }
            swap(nums, i + 1, r);
            return i + 1;
        }

        public void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
