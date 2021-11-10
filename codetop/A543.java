package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/10 15:36
 * @description 二叉树的直径
 */
public class A543 {
    public static void main(String[] args) {

    }

    class Solution {
        private int res = 0;.
        public int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return res-1;
        }
        public int height (TreeNode root) {
            if (root != null) {
                int l = height(root.left);
                int r = height(root.right);
                res = Math.max(res, l+r+1);
                return Math.max(l,r)+1;
            }
            return 0;
        }
    }
}
