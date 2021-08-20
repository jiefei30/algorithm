package acm.day0520;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/6/4 15:48
 * @description
 */
public class IceboundAndSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int q = sc.nextInt();
            int n = sc.nextInt();
            int p = sc.nextInt();
            System.out.println(((fastpow(q,n+1,p) - q)/(q-1))%p);
        }
    }

    public static long fastpow(long k, long e, long mod){
        long ans = 1;
        while (e > 0) {
           if ((e & 1) >= 1) {
               ans *= k%mod;
           }
           k*=k%mod;
           e>>=1;
        }
        return ans;
    }
}
