package codetop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/11/10 10:47
 * @description 路径总和 II
 */
public class A113 {
    public static void main(String[] args) {

    }

    class Solution {
        private List<List<Integer>> res = new ArrayList<>();
        private List<Integer> cur = new ArrayList<>();
        private int sum = 0;
        private int target = 0;

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            target = targetSum;
            dfs(root);
            return res;
        }

        public void dfs (TreeNode root) {
            if (root != null) {
                sum += root.val;
                cur.add(root.val);
                if (root.left == null && root.right == null) {
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        for (int i = 0; i < cur.size(); i++) {
                            temp.add(cur.get(i));
                        }
                        res.add(temp);
                    }
                }else {
                    dfs(root.left);
                    dfs(root.right);
                }
                sum -= root.val;
                cur.remove(cur.size()-1);
            }
        }
    }
}
