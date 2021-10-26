package codetop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/10/26 14:57
 * @description 二叉树的中序遍历
 */
public class A94 {
    public static void main(String[] args) {

    }

    class Solution {

        List<Integer> list = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            dfs(root);
            return list;
        }

        public void dfs (TreeNode root) {
            if (root != null) {
                dfs(root.left);
                list.add(root.val);
                dfs(root.right);
            }
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
