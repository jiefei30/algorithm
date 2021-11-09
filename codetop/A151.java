package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/8 15:00
 * @description 翻转字符串里的单词
 */
public class A151 {
    public static void main(String[] args) {

    }

    class Solution {
        public String reverseWords(String s) {
            StringBuilder sb = new StringBuilder("");
            s = s.trim();
            String[] arr = s.split(" ");
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i].length() != 0) {
                    sb.append(arr[i] + " ");
                }
            }
            sb.append(arr[0]);
            return sb.toString();
        }
    }
}
