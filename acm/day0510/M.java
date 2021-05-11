package acm.day0510;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/10 17:07
 * @description
 */
public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.next().toCharArray();
        }
        for (int i = 0 ; i < n;i++) {
            System.out.print(0);
            for (int j = 1; j < m-1;j++) {
                if (i %2 == 0) {
                    System.out.print(1);
                }else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println(1);
        }
        for (int i = 0 ; i < n;i++) {
            System.out.print(1);
            for (int j = 1; j < m-1;j++) {
                if (i %2 == 1) {
                    System.out.print(1);
                }else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println(0);
        }
    }
}
