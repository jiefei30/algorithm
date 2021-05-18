package acm.day0518;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/18 16:08
 * @description Divisor Subtraction
 */
public class CF1076B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = -1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                k = i;
                break;
            }
        }
        if (k == -1) {
            System.out.println(1);
        }else {
            System.out.println((n-k)/2 +1);
        }
    }
}
