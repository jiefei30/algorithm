package acm.day2;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/2 14:53
 * @description
 */

public class C_BalancedRemainders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] c = new int[3];
            int res = 0;
            for (int i = 0; i < n; i++) {
                int in = sc.nextInt();
                c[in%3]++;
            }
            while (! (c[0]==c[1]&&c[1]== c[2])) {
                if (c[0] >= c[1] && c[0] >= c[2]) {
                    if (c[1] > c[2] ) {
                        c[0]--;
                        c[2]++;
                        res+=2;
                    }else {
                        c[0]--;
                        c[1]++;
                        res++;
                    }
                }else if (c[1] >= c[0] && c[1] >= c[2]){
                    if (c[2] > c[0] ) {
                        c[1]--;
                        c[0]++;
                        res+=2;
                    }else {
                        c[1]--;
                        c[2]++;
                        res++;
                    }
                }else {
                    if (c[0] > c[1] ) {
                        c[2]--;
                        c[1]++;
                        res+=2;
                    }else {
                        c[2]--;
                        c[0]++;
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
