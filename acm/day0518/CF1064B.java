package acm.day0518;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/18 8:32
 * @description Equations of Mathematical Magic
 */
public class CF1064B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            if (a == 0) {
                System.out.println(1);
            }else {
                String s = Long.toBinaryString(a);
                long res = 1;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '1') {
                        res*=2;
                    }
                }
                System.out.println(res);
            }
        }
    }
}
