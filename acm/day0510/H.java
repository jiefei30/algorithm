package acm.day0510;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/20 16:19
 * @description
 */
public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int H = sc.nextInt();
        int S = sc.nextInt();
        int[][] messions = new int[n][3];
        for (int i = 0; i < n; i++) {
            messions[i][0] = sc.nextInt();
            messions[i][1] = sc.nextInt();
            messions[i][2] = sc.nextInt();
        }
    }
}
