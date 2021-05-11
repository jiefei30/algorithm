package acm.day3;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/3 15:43
 * @description
 */
public class F_BerlandPoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if (m == 0) {
                System.out.println(0);
                continue;
            }
            if (n/k >= m) {
                System.out.println(m);
                continue;
            }
            int res = n/k-(m-n/k)/(k-1);
            if ( (m-n/k)%(k-1)==0 ) {
                System.out.println(res);
            }else {
                System.out.println(res-1);
            }
        }
    }
}
