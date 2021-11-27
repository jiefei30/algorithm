package codetop;

import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author Wangmingcan
 * @date 2021/10/16 15:33
 * @description 二叉树的层序遍历
 */
public class A102 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            Queue<Object[]> queue = new ArrayDeque<>();
            Object[] arr = new Object[2];
            arr[0] = root;
            arr[1] = 1;
            queue.offer(arr);
            int cur = 1;
            List<Integer> list = new ArrayList<>();
            while (queue.size() != 0) {
                Object[] temp = queue.poll();
                TreeNode tn = (TreeNode)temp[0];
                Integer floor = (Integer)temp[1];
                if (tn != null) {
                    if (tn.left != null) {
                        queue.offer(new Object[]{tn.left, floor+1});
                    }
                    if (tn.right != null) {
                        queue.offer(new Object[]{tn.right, floor+1});
                    }
                    if (cur == floor) {
                        list.add(tn.val);
                    }else {
                        res.add(list);
                        list = new ArrayList<>();
                        list.add(tn.val);
                        cur = floor;
                    }
                }
            }
            res.add(list);
            return res;
        }
    }

    class Solution2 {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                int curLevelSize = queue.size();
                for (int i = 0; i < curLevelSize; i++) {
                    TreeNode node = queue.poll();
                    level.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                res.add(level);
            }
            return res;
        }
    }


    public class TreeNode {
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
