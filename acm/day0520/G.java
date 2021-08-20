package acm.day0520;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/21 8:35
 * @description
 */
public class G {
    public static int mod=998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        m=m%mod;
        n=n%mod;
        System.out.println(fastPow(m+1,n));
    }
    public static long fastPow(long x,long y) {
        long ans=1;
        while(y>=1)
        {
            if ((y&1)>=1) {
                ans*=x%mod;
            }
            x*=x%mod;
            y>>=1;
        }
        return ans;
    }
}


