package acm.day3;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/3 9:40
 * @description
 */
public class A_TitForTat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int index = 0;
            while (k > 0) {
                if (arr[index] > 0) {
                    arr[index]--;
                    arr[n-1]++;
                    k--;
                }else {
                    if (index == n-2){
                        break;
                    }else {
                        index++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
