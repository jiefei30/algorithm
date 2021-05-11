package acm.day2;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/2 9:23
 * @description
 */

public class D_AddAndDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = 0;
            if (b > a) {
                System.out.println(1);
                continue;
            }else if (b == a) {
                System.out.println(2);
                continue;
            }
            if (b == 1) {
                b++;
                res ++;
            }
            int last = 999999999;
            int index = 0;
            while (true) {
                int a1 = a;
                int b1 = b + index;
                int res1 =res;
                while (a1 > 0) {
                    a1= a1/b1;
                    res1++;
                }
                if (last >= res1) {
                    last = res1;
                    index++;
                    res++;
                }else {
                    break;
                }
            }
            System.out.println(last);
        }
    }
}
