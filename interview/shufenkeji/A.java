package interview.shufenkeji;

import java.util.Arrays;

/**
 * @author Wangmingcan
 * @date 2021/9/26 15:41
 * @description
 */
public class A {
    public static void main(String[] args) {
        int[][] test1 = {{14,1},{14,2},{14,3}};
        int[][] test2 = {{14,1},{13,1},{12,1}};
        System.out.println(test(test1, test1));
    }

    public static int test (int[][] arr1, int[][] arr2) {
        int[] a1 = judge(arr1);
        int[] a2 = judge(arr2);
        if (a1[0] < a2[0]) {
            return 1;
        }
        if (a1[0] > a2[0]) {
            return -1;
        }
        if (a1[1] < a2[1]) {
            return -1;
        }
        if (a1[1] > a2[1]) {
            return 1;
        }
        return 0;
    }

    public static int[] judge(int[][] arr) {
        if (arr == null || arr.length != 3) {
            return null;
        }
        int[] result = new int[2];
        result[0] = 6;
        result[1] = arr[0][0] + arr[1][0] + arr[2][0];
        if (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] ) {
            result[0] = 1;
            return result;
        }
        if (arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]) {
            if (shunzi(arr[0][0], arr[1][0], arr[2][0]) != null) {
                result = shunzi(arr[0][0], arr[1][0], arr[2][0]);
                result[0] = 2;
                return result;
            }
            result[0] = 3;
            return result;
        }
        if (shunzi(arr[0][0], arr[1][0], arr[2][0]) != null) {
            return shunzi(arr[0][0], arr[1][0], arr[2][0]);
        }
        if (arr[0][0] == arr[1][0]|| arr[0][0] == arr[2][0]) {
            result[0] = 5;
            return result;
        }
        return result;
    }

    public static int[] shunzi(int a, int b, int c){
        int[] result = null;
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        if (arr[0] == 2 && arr[1] == 3 && arr[2] ==14) {
            result = new int[2];
            result[0] = 4;
            result[1] = 6;
            return result;
        }
        if (arr[1] - arr[0] == 1 && arr[2] - arr[1] ==1) {
            result = new int[2];
            result[0] = 4;
            result[1] = a+b+c;
            return result;
        }
        return result;
    }
}
