package codetop;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Wangmingcan
 * @date 2021/8/20 9:31
 * @description 无重复字符的最长子串
 */
public class A003 {
    public static void main(String[] args) {
        System.out.println(new Solution003().lengthOfLongestSubstring("abca"));
    }
}

class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        int rk = -1, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                occ.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}