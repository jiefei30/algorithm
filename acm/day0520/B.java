package acm.day0520;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/20 18:33
 * @description
 */
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (M*(M+1)/2 <= N) {
                System.out.println("possible");
            }else {
                System.out.println("impossible");
            }
        }
    }
}
