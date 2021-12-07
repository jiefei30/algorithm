package codetop;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Wangmingcan
 * @date 2021/12/4 14:06
 * @description 最长连续序列
 */
public class A128 {
    public static void main(String[] args) {
        
    }

    class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];
                if (!set.contains(x-1)) {
                    int cur = 0;
                    while (set.contains(x)) {
                        cur++;
                        x++;
                    }
                    res = Math.max(res, cur);
                }
            }
            return res;
        }
    }
}
