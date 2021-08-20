package baidustar.test0726;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/7/26 13:54
 * @description 度度熊保护村庄
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] house = new int[n+1][2];
        for (int i = 1; i <= n; i++) {
            house[i][0] = sc.nextInt();
            house[i][0] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[][] pal = new int[m+1][2];
        for (int i = 1; i <= m; i++) {
            house[i][0] = sc.nextInt();
            house[i][0] = sc.nextInt();
        }

    }
}
