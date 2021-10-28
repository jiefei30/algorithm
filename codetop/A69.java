package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/27 19:33
 * @description Sqrt(x) （二分）
 */
public class A69 {
    public static void main(String[] args) {

    }

    class Solution {
        public int mySqrt(int x) {
            int res = -1, l = 0, r = x,m;
            while (l <= r) {
                m = l + (r - l)/2;
                if ((long)m*m <= x) {
                    l = m + 1;
                    res = m;
                }else {
                    r = m - 1;
                }
            }
            return res;
        }
    }
}
