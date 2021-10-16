package codetop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/10/16 9:34
 * @description 三数之和
 * @tip: 如果我们直接使用三重循环枚举三元组，会得到 O(N^3)个满足题目要求的三元组（其中 N 是数组的长度）
 * 时间复杂度至少为 O(N^3)在这之后，我们还需要使用哈希表进行去重操作，得到不包含重复三元组的最终答案，又消耗了大量的空间。
 * 这个做法的时间复杂度和空间复杂度都很高
 * 最优解：排序+双指针
 *
 *
 *
 * 算法流程：
 * 特判，对于数组长度 nn，如果数组为 nullnull 或者数组长度小于 33，返回 [][]。
 * 对数组进行排序。
 * 遍历排序后数组：
 * 若 nums[i]>0nums[i]>0：因为已经排序好，所以后面不可能有三个数加和等于 00，直接返回结果。
 * 对于重复元素：跳过，避免出现重复解
 * 令左指针 L=i+1L=i+1，右指针 R=n-1R=n−1，当 L<RL<R 时，执行循环：
 * 当 nums[i]+nums[L]+nums[R]==0nums[i]+nums[L]+nums[R]==0，执行循环，判断左界和右界是否和下一位置重复，去除重复解。并同时将 L,RL,R 移到下一位置，寻找新的解
 * 若和大于 00，说明 nums[R]nums[R] 太大，RR 左移
 * 若和小于 00，说明 nums[L]nums[L] 太小，LL 右移
 */
public class A15 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = new Solution15().threeSum(nums);
        for (int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }
}


class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int lastA = -9999999;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] > 0) {
                return result;
            }
            if (nums[i] == lastA) {
                continue;
            }
            lastA = nums[i];
            int lastLeft = -9999999;
            int right = nums.length;
            for (int j = i+1; j < right - 1; j++) {
                if (nums[j] == lastLeft) {
                    continue;
                }
                for (int k = right - 1; k > j; k--) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        result.add(temp);
                        right = k;
                        break;
                    }
                }
                lastLeft = nums[j];
            }
        }
        return result;
    }
}
