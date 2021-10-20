package interview;

import java.util.Arrays;

/**
 * @author Wangmingcan
 * @date 2021/10/18 14:10
 * @description
 */
public class Fib {
    public static void main(String[] args) {
//        fib(5);
//        cal(new int[]{2,5,1,2,3,4,7,7,6});
    }

    public void cal(int[] arr) {
        if (arr.length == 0) {
            System.out.println(0);
            return;
        }
        Arrays.sort(arr);
        int length = arr.length;
        long s = length * arr[length - 1];
        for (int i = 0; i < length; i++) {
            s -= arr[i];
        }
        System.out.println(s);
    }
}
