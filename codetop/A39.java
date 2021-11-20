package codetop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/11/20 19:45
 * @description 组合总和
 */
public class A39 {
    public static void main(String[] args) {

    }

    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        int[] arr;
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            arr = candidates;
            dfs(new ArrayList<>(), target, 0);
            return res;
        }

        public void dfs(List<Integer> list, int val, int index) {
            if (val < 0) {
                return;
            }
            if (val == 0) {
                res.add(new ArrayList<>(list));
            }
            for (int i = index; i < arr.length; i++) {
                list.add(arr[i]);
                dfs(list, val - arr[i], i);
                list.remove(list.size() - 1);
            }
        }
    }
}
