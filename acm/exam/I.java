package acm.exam;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/5 9:03
 * @description
 */
public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ji = 0;
            int o = 0;
            for (int i = 0; i < n;i++) {
                int cur = sc.nextInt();
                if (cur % 2 == 0) {
                    o++;
                }else {
                    ji++;
                }
            }
            if (ji == 0) {
                System.out.println(-1);
                continue;
            }
            System.out.println(o);
        }
    }
}
