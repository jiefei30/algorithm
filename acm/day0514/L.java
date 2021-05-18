package acm.day0514;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String[] init = scanner.nextLine().split(" ");
            //选手个数
            int n = Integer.valueOf(init[0]);
            //赛道长度
            long m = Long.valueOf(init[1]);
            //问题数
            long q = Long.valueOf(init[2]);
            long[] x = new long[n+1];
            //速度
            String[] xs = scanner.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                //速度
                x[i+1] = Long.valueOf(xs[i]);
            }
            for (int i = 0; i < q; i++) {
                //p秒
                long p = scanner.nextLong();
                //选手k
                int k = scanner.nextInt();
                long length = p * x[k];
                if ((length/m)%2 == 1) {
                    System.out.println(m - (length%m));
                }else {
                    System.out.println(length%m);
                }
            }
    }
}
