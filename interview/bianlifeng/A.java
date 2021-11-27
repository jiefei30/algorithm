package interview.bianlifeng;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/11/24 19:33
 * @description
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ori = sc.nextLine();
        String[] sarr = ori.split(",");
        int max = 0;
        for (int i = 0; i < sarr.length; i++) {
            max = Math.max(Integer.valueOf(sarr[i]), max);
        }
        int[] arr = new int[max+1];
        for (int i = 0; i < sarr.length; i++) {
            arr[Integer.valueOf(sarr[i])]++;
        }
        int outof = max + 1;
        int res = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                int count = arr[i] - 1;
                for (int j = start + 1; j < arr.length && count > 0; j++) {
                    if (arr[j] == 0) {
                        res += (j - i);
                        count--;
                        arr[j] = 1;
                        start = j;
                    }
                }
                while (count-- > 0) {
                    res += (outof++ - i);
                    start = outof;
                }
            }
        }
        System.out.println(res);
    }
}
