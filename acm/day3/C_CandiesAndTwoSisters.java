package acm.day3;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/3 14:39
 * @description
 */
public class C_CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            Long n = sc.nextLong();
            if (n < 3) {
                System.out.println(0);
                continue;
            }
            System.out.println((n-1)/2);
        }
    }
}
