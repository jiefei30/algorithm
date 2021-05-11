package acm.day1;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/1 11:14
 * @description
 */

public class F_SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
            }
            int common = -1;
            if (arr[0] == arr[1]) {
                common = arr[0];
            }else {
                if (arr[1] == arr[2]) {
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
                continue;
            }
            for (int i = 2; i < n; i++) {
                if(arr[i] != common){
                    System.out.println(i+1);
                }
            }
        }
    }
}
