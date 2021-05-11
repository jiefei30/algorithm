package acm.day2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/4 15:35
 * @description
 */
public class H_MorningJogging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[] arr = new long[n*m];
            for (int i = 0; i < n*m; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long res = 0;
            for (int i = 0; i < m;i++) {
                res += arr[i];
            }
            System.out.println(res);
        }
    }
}
