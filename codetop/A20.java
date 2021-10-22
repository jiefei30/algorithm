package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/22 10:37
 * @description 有效的括号
 */
public class A20 {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()[]{}"));
    }

    static class Solution {
        public boolean isValid(String s) {
            boolean res = false;
            while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
                s = s.replace("()", "");
                s = s.replace("[]", "");
                s = s.replace("{}", "");
            }
            if (s.length() == 0) {
                res = true;
            }
            return res;
        }
    }

}
