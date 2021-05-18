package acm.day0518;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/18 10:32
 * @description LCM
 */
public class CF1068B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long b = sc.nextLong();
        long res = 0;
        long sqrt = (long) Math.sqrt(b);
        for (int i = 1; i <= sqrt; i++) {
            if (b % i == 0) {
                res+=2;
            }
        }
        if (sqrt*sqrt == b) {
            res--;
        }
        System.out.println(res);
    }
}
