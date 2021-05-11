package acm.day3;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/3 16:24
 * @description
 */
public class G_BuyingShovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            Long n = sc.nextLong();
            Long k = sc.nextLong();
            if (n <= k || n == 1) {
                System.out.println(1);
                continue;
            }
            Long res = n+1;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n%i == 0) {
                    if (n/i <= k) {
                        res = Long.valueOf(i);
                        break;
                    }else if (i <= k) {
                        res = res>n/i?n/i:res;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
