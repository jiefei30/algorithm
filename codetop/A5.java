package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/22 16:49
 * @description 最长回文子串
 * 状态：dp[i][j]表示字串s[i..j]是否为回文子串
 * 得到状态转移方程：dp[i][j] = (s[i] == s[j]) and dp[i + 1][j - 1]
 * 边界条件：j - 1 - (i + 1) + 1 < 2，整理得 j - i  < 3 <=> j - i + 1 < 4
 * 即s[i..j]长度为2或者3时，不用检查字串是否回文
 * 初始化dp[i][i] = true
 * 输出：在得到一个状态的值为true的时候，记录起始位置和长度，填表完成以后再截取
 */
public class A5 {
    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("cbbd"));
    }

    static class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }
            int len = s.length();
            String res = s.charAt(0) + "";
            boolean[][] dp = new boolean[len][len];
            for (int j = 0; j < len; j++) {
                for (int i = 0; i <= j; i++) {
                    if (i == j) {
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = ((dp[i + 1][j - 1]) || (j - i < 3)) && (s.charAt(i) == s.charAt(j));
                    }
                    if (dp[i][j] && j - i > res.length() - 1) {
                        res = s.substring(i, j+1);
                    }
                }
            }
            return res;
        }
    }
}
