package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/13 15:24
 * @description 路径总和
 */
public class A112 {
    public static void main(String[] args) {

    }

    class Solution {
        private boolean res = false;
        public boolean hasPathSum(TreeNode root, int targetSum) {
            dfs(root, targetSum);
            return res;
        }

        public void dfs(TreeNode root, int curSum) {
            if (!res && root != null) {
                int val = curSum - root.val;
                if (root.left == null && root.right == null) {
                    res = val == 0 ? true : res;
                }
                dfs(root.left, val);
                dfs(root.right, val);
            }
        }
    }
}
