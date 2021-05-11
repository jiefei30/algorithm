package acm.day3;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/4 9:20
 * @description
 */
public class E_RockAndLever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long[] binary = new long[32];
            long res = 0;
            for (int i = 0; i < n;i++) {
                String s = Long.toBinaryString(sc.nextLong());
                binary[s.length()] ++;
            }
            for (int i = 0; i < binary.length;i++) {
                res += binary[i]*(binary[i]-1)/2;
            }
            System.out.println(res);
        }
    }
}
