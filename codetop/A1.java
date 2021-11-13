package codetop;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wangmingcan
 * @date 2021/8/31 21:49
 * @description 两数之和 （哈希表）
 */
public class A1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target-nums[i])) {
                    return new int[] {i, map.get(target-nums[i])};
                }
                map.put(nums[i], i);
            }
            return null;
        }
    }
}
