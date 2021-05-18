package acm.day0518;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/18 11:24
 * @description Vasya and Book
 */
public class CF1082A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long d = sc.nextLong();
            if ((Math.abs(y-x))%d == 0) {
                System.out.println((Math.abs(y-x))/d);
                continue;
            }
            long res1 = 0;
            res1 += (x-1)/d;
            if ((x-1)%d != 0) {
                res1++;
            }
            if ((y-1)%d == 0) {
                res1 +=(y-1)/d;
            }else {
                res1 = 0;
            }
            long res2 = 0;
            res2 += (n - x)/d;
            if ((n - x)%d != 0) {
                res2++;
            }
            if ((n - y) %d == 0) {
                res2+=(n - y)/d;
            }else {
                res2 = 0;
            }
            if (res1 == 0 && res2 !=0) {
                System.out.println(res2);
            }else if (res2 == 0 && res1 != 0) {
                System.out.println(res1);
            }else if (res1!=0 && res2!=0) {
                long res = res1>res2?res2:res1;
                System.out.println(res);
            }else {
                System.out.println(-1);
            }
        }
    }
}
