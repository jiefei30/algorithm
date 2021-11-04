package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/3 15:54
 * @description 字符串转换整数 (atoi) (自动机)
 */
public class A8 {
    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("  0000000000012345678"));
    }

    static class Solution {
        public int myAtoi(String s) {
            int j = 0;
            for (; j < s.length();) {
                if (s.charAt(j) == ' ') {
                    j++;
                }else {
                    break;
                }
            }
            s = s.substring(j);
            if (s.length() <= 0) {
                return 0;
            }
            boolean isNegative = false;
            int i = 0, res = 0;
            if (s.charAt(0) == '-' || s.charAt(0) == '+') {
                if (s.charAt(0) == '-') {
                    isNegative = true;
                }
                i = 1;
            }
            for (; i < s.length();) {
                if (s.charAt(i) == '0') {
                    i++;
                }else {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder("");
            for (; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    sb.append(s.charAt(i));
                }else {
                    break;
                }
            }
            String str = sb.toString();
            if (str.length() != 0) {
                if (str.length() > 10) {
                    if (isNegative) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }else {
                    long l = Long.valueOf(str);
                    if (l > Integer.MAX_VALUE) {
                        if (isNegative) {
                            return Integer.MIN_VALUE;
                        }
                        return Integer.MAX_VALUE;
                    }else {
                        if (isNegative) {
                            return -1*Integer.valueOf(str);
                        }
                        return Integer.valueOf(str);
                    }
                }
            }
            return res;
        }
    }
}
