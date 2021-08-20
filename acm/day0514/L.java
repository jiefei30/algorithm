package acm.day0514;

import java.io.*;
import java.util.Scanner;

public class L {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
            String[] init = br.readLine().split(" ");
            //选手个数
            int n = Integer.valueOf(init[0]);
            //赛道长度
            long m = Long.valueOf(init[1]);
            //问题数
            long q = Long.valueOf(init[2]);
            long[] x = new long[n+1];
            //速度
            String[] xs = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                //速度
                x[i+1] = Long.valueOf(xs[i]);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < q; i++) {
                String s2[]=br.readLine().split(" ");
                //p秒
                long p = Long.parseLong(s2[0]);
                //选手k
                int k = Integer.parseInt(s2[1]);
                long length = p * x[k];
                if ((length/m)%2 == 1) {
                    sb.append(m - (length%m));
                }else {
                    sb.append(length%m);
                }
                sb.append('\n');
            }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
