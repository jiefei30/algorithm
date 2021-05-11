package acm.day2;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/2 15:09
 * @description
 */

public class E_NewColony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println(-1);
                continue;
            }
            int i = 0;
            boolean isOver = false;
            while ( k > 0) {
                if (h[i] >= h[i+1]) {
                    i++;
                    if (i >= n-1) {
                        isOver = true;
                        break;
                    }
                }else {
                    h[i]++;
                    k--;
                    if (k!=0) {
                        i = 0;
                    }
                }
            }
            if (isOver) {
                System.out.println(-1);
            }else {
                System.out.println(i+1);
            }
        }
    }
}
