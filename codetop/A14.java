package codetop;

/**
 * @author Wangmingcan
 * @date 2021/12/8 20:05
 * @description 最长公共前缀
 */
public class A14 {
    public static void main(String[] args) {

    }

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) {
                return "";
            }
            int len = Integer.MAX_VALUE;
            for (int i = 0; i < strs.length; i++) {
                len = Math.min(len, strs[i].length());
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                char temp = strs[0].charAt(i);
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].charAt(i) != temp) {
                        return sb.toString();
                    }
                }
                sb.append(temp);
            }
            return sb.toString();
        }
    }
}
