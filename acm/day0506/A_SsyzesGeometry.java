package acm.day0506;

import java.util.*;

/**
 * @author Wangmingcan
 * @date 2021/5/6 21:27
 * @description
 */
public class A_SsyzesGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long l = sc.nextLong();
        long[] arr = new long[n];
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextLong();
            map.put(arr[i], i);
        }
        if (n < 3) {
            System.out.println(0);
            return;
        }
        long res = 0;
        for (int i = 1 ; i < n;i++) {
            if (arr[i] - arr[0] <= l/2) {
//                res += map.get()
            }else {
                break;
            }
        }
    }
}
