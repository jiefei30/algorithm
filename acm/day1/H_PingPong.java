package acm.day1;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/1 14:45
 * @description
 */

public class H_PingPong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0 ) {
            int alice = sc.nextInt();
            int bob = sc.nextInt();
            System.out.println((alice - 1) + " " + bob);
        }
    }
}
