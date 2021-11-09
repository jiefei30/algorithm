package codetop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/11/9 9:53
 * @description 求根节点到叶节点数字之和
 */
public class A129 {
    public static void main(String[] args) {

    }

    class Solution {
        private StringBuilder sb = new StringBuilder();
        private int res = 0;
        public int sumNumbers(TreeNode root) {
            if (root != null) {
                sb.append(root.val);
                if (root.left == null && root.right == null) {
                    res += Integer.valueOf(sb.toString());
                }else {
                    sumNumbers(root.left);
                    sumNumbers(root.right);
                }
                sb.deleteCharAt(sb.length()-1);
            }
            return res;
        }
    }
}
