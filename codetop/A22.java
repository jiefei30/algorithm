package codetop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/11/19 20:12
 * @description 括号生成
 */
public class A22 {
    public static void main(String[] args) {
        List<String> list = new Solution().generateParenthesis(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static class Solution {
        List<String> res = new ArrayList<>();
        public List<String> generateParenthesis(int n) {
            dfs(n, n, "");
            return res;
        }

        public void dfs(int left, int right, String s) {
            for (int i = 0; i < 2; i++) {
                if (left == 0 && right == 0) {
                    res.add(s);
                    break;
                }
                if (i == 0 && left > 0) {
                    dfs(left - 1, right, s + "(");
                }else if (i == 1 && right > left) {
                    dfs(left, right - 1, s + ")");
                }
            }
        }
    }
}
