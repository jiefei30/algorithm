package interview.bianlifeng;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/11/24 20:21
 * @description
 */
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] sarr = line1.split(",");
        int max = 0;
        for (int i = 0; i < sarr.length; i++) {
            max = Math.max(Integer.valueOf(sarr[i]), max);
        }
        int[] arr = new int[max+1];
        for (int i = 0; i < sarr.length; i++) {
            arr[Integer.valueOf(sarr[i])]++;
        }
        int box = Integer.valueOf(line2);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                int count = box / i;
                if (count >= arr[i]) {
                    res += arr[i];
                    box -= arr[i]*i;
                }else if (count > 0) {
                    res += count;
                    box -= count*i;
                }else {
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
