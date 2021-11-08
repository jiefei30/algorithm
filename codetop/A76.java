package codetop;

import java.util.HashMap;

/**
 * @author Wangmingcan
 * @date 2021/11/5 21:27
 * @description 最小覆盖子串（滑动窗口）
 */
public class A76 {
    public static void main(String[] args) {
        System.out.println(new Solution().minWindow("ADOBECODEBANC","ABC"));
    }

    static class Solution {
        public String minWindow(String s, String t) {
            String res = "";
            int[] sarr = new int[60];
            int[] tarr = new int[60];
            for (int i = 0; i < t.length(); i++) {
               tarr[t.charAt(i) - 'A']++;
            }
            int l = 0, r = 0;
            while (l <= r) {
                boolean isHave = true;
                for (int j = 0; j < 60; j++) {
                    if (sarr[j] < tarr[j]) {
                        isHave = false;
                        break;
                    }
                }
                if (isHave) {
                    String temp = s.substring(l, r);
                    System.out.println(temp);
                    if (res.length() == 0) {
                        res = temp;
                    }else {
                        res = temp.length() < res.length() ? temp:res;
                    }
                    sarr[s.charAt(l) - 'A']--;
                    l++;
                }else if (r < s.length()) {
                    sarr[s.charAt(r) - 'A']++;
                    r++;
                }else {
                    break;
                }
            }
            return res;
        }
    }
}
