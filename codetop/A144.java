package codetop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/11/4 14:45
 * @description 二叉树的前序遍历
 */
public class A144 {
    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            dfs(root);
            return list;
        }
        public void dfs (TreeNode root) {
            if (root != null) {
                list.add(root.val);
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
}
