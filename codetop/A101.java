package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/18 19:58
 * @description 对称二叉树
 * 两个指针，同步对称移动
 */
public class A101 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return dfs(root, root);
        }

        public boolean dfs(TreeNode q, TreeNode p) {
            if (q == null && p == null) {
                return true;
            }
            if (q == null || p == null) {
                return false;
            }
            return q.val == p.val && dfs(q.left, p.right) && dfs(q.right, p.left);
        }
    }
}
