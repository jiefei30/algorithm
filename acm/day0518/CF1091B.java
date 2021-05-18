package acm.day0518;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/18 11:13
 * @description New Year and the Treasure Geolocation
 */
public class CF1091B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a=0,b=0;
        for (int i = 0; i < 2*n; i++) {
            a += sc.nextLong();
            b += sc.nextLong();
        }
        System.out.println(a/n+" " + b/n);
    }
}
