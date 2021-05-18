package acm.day0514;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/14 8:12
 * @description
 */
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                String url = sc.next();
                arr[i] = Integer.valueOf(url.substring(33));
            }
            Arrays.sort(arr);
            for (int i = 0; i < k;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
}
