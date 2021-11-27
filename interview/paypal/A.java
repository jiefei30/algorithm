package interview.paypal;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author Wangmingcan
 * @date 2021/11/26 15:25
 * @description
 */
public class A {

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
        System.out.println(new Soultion().getDepthestSum(root));
    }

    static class Soultion {

        private int sum;
        private int maxHeight;

        public int getDepthestSum(TreeNode node) {
            maxHeight = getMaxHeight(node);
            dfs(node, 1);
            return sum;
        }

        public void dfs(TreeNode node, int depth) {
            if (node != null) {
                if (depth == maxHeight) {
                    sum += node.val;
                }else {
                    dfs(node.left, depth + 1);
                    dfs(node.right, depth + 1);
                }
            }
        }

        public int getMaxHeight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return Math.max(getMaxHeight(root.left), getMaxHeight(root.right)) + 1;
        }
    }

    class Soultion2 {
        public int getDepthestSum(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int res = 0;
            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);
            List<TreeNode> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.right != null) {
                    list.add(node);
                }
                if (node.left != null) {
                    list.add(node);
                }
                if (queue.size() == 0) {
                    for (int i = 0; i < list.size(); i++) {
                        queue.offer(list.get(i));
                    }
                    list.clear();
                }
            }
            return res;
        }
    }
}
