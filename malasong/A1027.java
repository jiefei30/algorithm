package malasong;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/8/14 14:54
 * @description
 */
public class A1027 {
    public static void main(String[] args) {
        int[][] arr = {{2,4},{0,2},{3,2},{3,2},{1,3},{3,2},{3,3},{1,2},{3,4},{3,3}};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a = sc.nextInt();
            System.out.println(arr[a][0] + " " + arr[a][1]);
        }
    }
}
