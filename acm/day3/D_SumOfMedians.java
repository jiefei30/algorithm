package acm.day3;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/3 14:45
 * @description
 */
public class D_SumOfMedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Long[] nk = new Long[n*k];
            Long res = 0L;
            for (int i = 0; i < n*k;i++) {
                nk[i] = sc.nextLong();
            }
            for (int i = 1; i <= k ;i++) {
                res += nk[n*k - (n/2+1)*i];
            }
            System.out.println(res);
        }
    }
}
