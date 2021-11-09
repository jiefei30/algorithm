package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/8 15:12
 * @description 编辑距离（递归/动规）
 */
public class A72 {
    public static void main(String[] args) {

    }

    class Solution {
        public int minDistance(String word1, String word2) {
            int l1 = word1.length();
            int l2 = word2.length();
            int[][] dp = new int[l1 + 1][l2 + 1];
            for (int i = 0; i < l1 + 1; i++) {
                dp[i][0] = i;
            }
            for (int i = 0; i < l2 + 1; i++) {
                dp[0][i] = i;
            }
            for (int i = 0; i < l1; i++) {
                for (int j = 0; j < l2; j++) {
                    if (word1.charAt(i) == word2.charAt(j)) {
                        dp[i+1][j+1] = dp[i][j];
                    }else {
                        dp[i+1][j+1] = 1 + Math.min(Math.min(dp[i][j+1], dp[i+1][j]), dp[i][j]);
                    }
                }
            }
            return dp[l1][l2];
        }

        public int minDistance_recursion(String word1, String word2) {
            if (word1.length() == 0 || word2.length() == 0) {
                return Math.max(word1.length(), word2.length());
            }
            if (word1.charAt(word1.length()-1) == word2.charAt(word2.length()-1)) {
                return minDistance_recursion(word1.substring(0, word1.length()-1),
                        word2.substring(0, word2.length()-1));
            }
            return 1 + Math.min(Math.min(minDistance_recursion(word1, word2.substring(0, word2.length()-1)),
                    minDistance_recursion(word1.substring(0, word1.length()-1), word2)),
                    minDistance_recursion(word1.substring(0, word1.length()-1),word2.substring(0, word2.length()-1)));
        }
    }
}
