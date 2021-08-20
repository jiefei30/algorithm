package malasong;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/8/7 9:03
 * @description
 */
public class A1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();
        for (int i = 0; i < m; i++) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            for (int j = c1 - 1; j < c2; j++) {
                if (arr[j] == s1.charAt(0)) {
                    arr[j] = s2.charAt(0);
                }
            }
        }
        System.out.println(new String(arr));
    }
}
