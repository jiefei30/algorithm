package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/13 15:39
 * @description 验证二叉搜索树
 * 1.递归，但要判断节点的上下界
 * 2.递归，中序遍历需递增
 */
public class A98 {
    public static void main(String[] args) {

    }

    class Solution {
        Long last = Long.MIN_VALUE;
        public boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }
            if (isValidBST(root.left)) {
                if (last < root.val) {
                    last = root.val + 0L;
                    return isValidBST(root.right);
                }
            }
            return false;
        }
    }
}
