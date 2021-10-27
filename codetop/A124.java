package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/27 16:43
 * @description 二叉树中的最大路径和
 */
public class A124 {
    public static void main(String[] args) {

    }

    class Solution {

        int res = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            dfs(root);
            return res;
        }

        public int dfs(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = Math.max(dfs(node.left), 0);
            int right = Math.max(dfs(node.right), 0);
            res = Math.max(res, node.val + left + right);
            return node.val + Math.max(left, right);
        }
    }

    /**
     *  第一次写的错误答案，但并未找出错误
     */
    class Solution_wrong {

        int res = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            return Math.max(res, dfs(root));
        }

        public int dfs(TreeNode root) {
            int left = root.left == null ? 0 : dfs(root.left);
            res = Math.max(res, left);
            int right = root.right == null ? 0 : dfs(root.right);
            res = Math.max(res, right);
            if (root.val < 0) {
                return 0;
            }
            int a = Math.max(root.val, left + root.val);
            int b = Math.max(root.val, right + root.val);
            int c = Math.max(root.val, left + right + root.val);
            return Math.max(Math.max(a, b), c);
        }
    }
}
