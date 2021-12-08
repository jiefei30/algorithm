package interview.bytedance;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/11/2 15:25
 * @description
 * Z国的货币系统包含面值1元、4元、16元、64元共计4种硬币，以及面值1024元的纸币。
 * 现在小Y使用1024元的纸币购买了一件价值为N(0<N≤1024)的商品，请问最少他会收到多少硬币？
 */
public class Spring2019_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        int[] arr = new int[]{64, 16, 4, 1};
        int yu = 1024 - N;
        for (int i = 0; i < 4; i++) {
            int t = yu/arr[i];
            res += t;
            if (yu % arr[i] == 0) {
                break;
            }else {
                yu -= t*arr[i];
            }
        }
        System.out.println(res);
    }
}
