package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/22 10:51
 * @description 字符串相加
 */
public class A415 {
    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("6994", "36"));
    }
    static class Solution {
        public String addStrings(String num1, String num2) {
            if (num2.length() > num1.length()) {
                String temp = num1;
                num1 = num2;
                num2 = temp;
            }
            int yu = 0;
            String s = "";
            for (int i = 1; i <= num1.length(); i++) {
                int sum = 0;
                int a = Integer.valueOf(num1.charAt(num1.length() - i) + "");
                if (i <= num2.length()) {
                    int b = Integer.valueOf(num2.charAt(num2.length() - i) + "");
                    sum = a+b+yu;
                }else {
                    sum = a+yu;
                }
                if (sum >= 10) {
                    yu = 1;
                    s = (sum-10) + s;
                }else {
                    yu = 0;
                    s = sum + s;
                }
            }
            if (yu == 1) {
                s = 1 + s;
            }
            return s;
        }
    }
}
