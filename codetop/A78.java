package codetop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/11/13 14:23
 * @description 子集
 * 位运算
 */
public class A78 {
    public static void main(String[] args) {
        new Solution().subsets(new int[]{1,2,3});
    }

    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> t = new ArrayList<>();
            int n = nums.length;
            for (int i = 0; i < (1 << n); i++) {
                t.clear();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0) {
                        t.add(nums[j]);
                    }
                }
                res.add(new ArrayList<>(t));
            }
            return res;
        }
    }
}
