package acm.day2;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/2 20:36
 * @description
 */

public class I_Inflation {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Long[] p = new Long[n];
            Long res = 0L;
            p[0] = sc.nextLong();
            Long pnum = p[0];
            for (int i = 1; i < n; i++) {
                p[i] = sc.nextLong();
                if (p[i] * 100 > k*pnum) {
                    Long inc = (p[i]*100 - k*pnum)/k;
                    if ((p[i]*100 - k*pnum)%k != 0) {
                        inc ++;
                    }
                    res += inc;
                    pnum += inc;
                }
                pnum += p[i];
            }
            System.out.println(res);
        }
    }
}
