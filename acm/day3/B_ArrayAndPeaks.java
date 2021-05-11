package acm.day3;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/3 10:32
 * @description
 */
public class B_ArrayAndPeaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n < 3 && k!= 0) {
                System.out.println(-1);
                continue;
            }
            if (k >= (n+1)/2) {
                System.out.println(-1);
                continue;
            }
            int[] arr = new int[n];
            for (int i = 0; i < n;i++) {
                arr[i] = i+1;
            }
            if (k==0) {
                for (int i = 0; i < n;i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                continue;
            }
            for (int i = 0; k > 0;) {
                int temp = arr[n-1-2*i-1];
                arr[n-1-2*i-1] = arr[n-1-2*i];
                arr[n-1-2*i] = temp;
                k--;
                i++;
            }
            for (int i = 0; i < n;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
