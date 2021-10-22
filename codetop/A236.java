package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/21 10:38
 * @description 二叉树的最近公共祖先
 */
public class A236 {
    public static void main(String[] args) {

    }

    class Solution {
        private TreeNode res;

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            dfs(root, p, q);
            return res;
        }

        public boolean dfs (TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || res != null) {
                return false;
            }
            boolean l = dfs(root.left, p, q);
            boolean r = dfs(root.right, p, q);
            if ((l && r) || ((l || r) && (root.val == p.val || root.val == q.val))) {
                res = root;
            }
            return l || r || (root.val == p.val || root.val == q.val);
        }
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;
        }
    }
}
