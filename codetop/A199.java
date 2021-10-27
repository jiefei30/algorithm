package codetop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/10/27 15:33
 * @description 二叉树的右视图 （DFS）
 */
public class A199 {
    public static void main(String[] args) {

    }

    class Solution {
        List<Integer> res = new ArrayList<>();

        public List<Integer> rightSideView(TreeNode root) {
            dfs(root, 0);
            return res;
        }

        public void dfs (TreeNode root, int depth) {
            if (root != null) {
                if (depth == res.size()) {
                    res.add(root.val);
                }
                dfs(root.right, depth+1);
                dfs(root.left, depth+1);
            }
        }
    }
}
