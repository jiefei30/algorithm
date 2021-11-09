package codetop;

import java.util.HashMap;

/**
 * @author Wangmingcan
 * @date 2021/11/9 10:49
 * @description 从前序与中序遍历序列构造二叉树
 */
public class A105 {
    public static void main(String[] args) {

    }

    class Solution {

        private HashMap<Integer, Integer> map = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            return buildTree(preorder, 0, preorder.length - 1, 0, inorder.length - 1);
        }

        public TreeNode buildTree(int[] preorder, int preLeft, int preRight, int inLeft, int inRight) {
            if (preLeft > preRight || inLeft > inRight) {
                return null;
            }
            int val = preorder[preLeft];
            TreeNode node = new TreeNode(val);
            int pIndex = map.get(val);
            node.left = buildTree(preorder, preLeft+1, pIndex - inLeft + preLeft, inLeft, pIndex - 1);
            node.right = buildTree(preorder, pIndex - inLeft + preLeft + 1, preRight, pIndex + 1, inRight);
            return node;
        }
    }
}
