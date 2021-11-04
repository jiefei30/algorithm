package exam.bianlifeng;

import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split(",");
        int[] dp = new int[arr.length+1];
        dp[0] = 0;
        dp[1] = Integer.valueOf(arr[0]);
        for (int i = 2; i <= arr.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]+Integer.valueOf(arr[i-1]));
        }
        System.out.println(dp[arr.length]);
    }
}
