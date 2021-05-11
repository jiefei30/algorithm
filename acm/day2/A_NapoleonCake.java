package acm.day2;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/2 9:55
 * @description
 */

public class A_NapoleonCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0 ; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = n-1 ; i >= 0;) {
                if (arr[i] == 0) {
                    i--;
                    continue;
                }
                int layer = arr[i];
                int next = i - arr[i];
                for (int j = i ; layer > 0;) {
                    if (j >= 0) {
                        if (arr[j] > layer) {
                            next = j - arr[j];
                            layer = arr[j];
                        }
                        arr[j] = 1;
                        j--;
                        layer--;
                    }else{
                        break;
                    }
                }
                i= next;
            }
            for (int i = 0 ; i < n;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
