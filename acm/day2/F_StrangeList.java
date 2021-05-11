package acm.day2;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/2 16:16
 * @description
 */

public class F_StrangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Long x = sc.nextLong();
            Long res = 0L;
            Long[] arr = new Long[n];
            Long[] times = new Long[n];
            Long min = 9999999L;
            int index = 0;
            for (int i = 0; i < n;i++) {
                arr[i] = sc.nextLong();
                times[i] = arr[i];
                res += arr[i];
                Long cur = 0L;
                while (times[i] > 0) {
                    if (times[i] % x == 0) {
                        times[i]/=x;
                        cur++;
                    }else{
                        break;
                    }
                }
                if (cur < min) {
                    min = cur;
                    index = i;
                }
                times[i] = cur;
            }
            res += min *res;
            for (int i = 0;i < index;i++) {
                res += arr[i];
            }
            System.out.println(res);
        }
    }
}
