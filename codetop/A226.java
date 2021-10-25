package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/25 17:11
 * @description 翻转二叉树
 */
public class A226 {
    public static void main(String[] args) {

    }

    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root != null) {
                invertTree(root.left);
                invertTree(root.right);
                TreeNode tree = root.left;
                root.left = root.right;
                root.right = tree;
            }
            return root;
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
