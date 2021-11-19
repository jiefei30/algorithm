package other.classicalAlgorithm;

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
}
