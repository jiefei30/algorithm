package acm.day0518;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/18 10:09
 * @description Petr and a Combination Lock
 */
public class CF1097B {
    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0,0);
        System.out.println("NO");
    }

    public static void dfs (int i, int degree) {
        if (i == arr.length) {
            if (degree % 360 == 0) {
                System.out.println("YES");
                System.exit(0);
            }
        }else {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    dfs(i+1, (degree+arr[i])%360);
                }else {
                    dfs(i+1, Math.abs(degree-arr[i]));
                }
            }
        }
    }
}
