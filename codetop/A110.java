package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/10 11:08
 * @description 平衡二叉树
 */
public class A110 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root != null) {
                return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
            }
            return true;
        }

        public int height (TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                return Math.max(height(root.left), height(root.right)) + 1;
            }
        }
    }
}
