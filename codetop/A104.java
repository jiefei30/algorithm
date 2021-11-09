package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/9 10:20
 * @description 二叉树的最大深度
 */
public class A104 {
    public static void main(String[] args) {

    }

    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
            }
        }
    }
}
