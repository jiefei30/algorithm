package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/21 9:26
 * @description 数组中第一个不重复的数字
 */
public class A387 {
    public static void main(String[] args) {

    }

    class Solution {
        public int firstUniqChar(String s) {
            int start;
            int end;
            int result = s.length();
            for(char ch='a';ch<='z';ch++) {
                start = s.indexOf(ch);
                end = s.lastIndexOf(ch);
                if(start == end && start != -1) {
                    result = Math.min(result,start);
                }
            }
            if(result == s.length()) {
                return -1;
            }
            return result;
        }
    }
}
