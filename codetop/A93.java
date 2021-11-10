package codetop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/11/10 9:27
 * @description 复原 IP 地址
 */
public class A93 {
    public static void main(String[] args) {
        new Solution().restoreIpAddresses("25525511135");
    }

    static class Solution {

        private List<String> res = new ArrayList<>();
        private String param;

        public List<String> restoreIpAddresses(String s) {
            param = s;
            dfs("", 0, 1);
            return res;
        }

        public void dfs (String s, int index, int count) {
            if (count >= 4) {
                if (judge(index, param.length())) {
                    res.add(s + param.substring(index));
                }
            }else {
                for (int i = 1; i <= 3; i++) {
                    if ((index + i) <= param.length() && judge(index, index+i)) {
                        dfs(s+param.substring(index, index+i)+".", index+i, count + 1);
                    }
                }
            }
        }

        public boolean judge (int start, int end) {
            String temp = param.substring(start, end);
            if (temp.length() <= 3 && temp.length() != 0) {
                int val = Integer.valueOf(temp);
                if (String.valueOf(val).length() == temp.length() && val <= 255) {
                    return true;
                }
            }
            return false;
        }
    }
}
