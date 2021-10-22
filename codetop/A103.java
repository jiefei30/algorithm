package codetop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author Wangmingcan
 * @date 2021/10/20 21:55
 * @description
 */
public class A103 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
            List<Object[]> tempList = new ArrayList<>();
            while (queue.size() != 0) {
                Object[] temp = queue.poll();
                TreeNode tn = (TreeNode)temp[0];
                Integer floor = (Integer)temp[1];
                if (tn != null) {
                    if (floor % 2 == 0) {
                        if (tn.right != null) {
                            tempList.add(new Object[]{tn.right, floor + 1});
                        }
                        if (tn.left != null) {
                            tempList.add(new Object[]{tn.left, floor + 1});
                        }
                    }else {
                        if (tn.left != null) {
                            tempList.add(new Object[]{tn.left, floor + 1});
                        }
                        if (tn.right != null) {
                            tempList.add(new Object[]{tn.right, floor + 1});
                        }
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
                if (queue.size() == 0) {
                    while (tempList.size() > 0) {
                        if (floor % 2 == 1) {
                            queue.offer(tempList.get(tempList.size() - 1));
                            tempList.remove(tempList.size() - 1);
                        }else {
                            queue.offer(tempList.get(0));
                            tempList.remove(0);
                        }
                    }
                }
            }
            res.add(list);
            return res;
        }
    }

    public class TreeNode {
        int val;
        A102.TreeNode left;
        A102.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, A102.TreeNode left, A102.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
