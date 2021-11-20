package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/20 14:00
 * @description 比较版本号
 * 最优解法双指针
 */
public class A165 {
    public static void main(String[] args) {
        System.out.println(new Solution().compareVersion("0.1", "1.1"));
    }

    static class Solution {
        public int compareVersion(String version1, String version2) {
            String[] s1 = version1.split("\\.");
            String[] s2 = version2.split("\\.");
            int len1 = s1.length;
            int len2 = s2.length;
            for (int i = 0; i < len1 && i < len2; i++) {
                if (Integer.valueOf(s1[i]) > Integer.valueOf(s2[i])) {
                    return 1;
                }
                if (Integer.valueOf(s1[i]) < Integer.valueOf(s2[i])) {
                    return -1;
                }
            }
            if (len1 > len2 && remain(s1, len2) > 0) {
                return 1;
            }else if (len1 < len2 && remain(s2, len1) > 0) {
                return -1;
            }
            return 0;
        }

        public int remain(String[] arr, int start) {
            StringBuilder sb = new StringBuilder("");
            for (int i = start; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            return Integer.valueOf(sb.toString());
        }
    }
}
