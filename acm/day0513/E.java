package acm.day0513;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/13 8:40
 * @description
 */
public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] parent = new int[n+1][2];
        for (int i = 1; i <= n;i++) {
            parent[i][1] = 1;
        }
        for (int i = 0; i < n-1;i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            parent[c][0] = p;
            parent[c][1] = parent[p][1]+1;
        }
        int A = sc.nextInt();
        int B = sc.nextInt();
        if ((parent[A][1] - parent[B][1]) %2 != 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}