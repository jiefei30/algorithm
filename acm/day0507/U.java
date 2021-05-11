package acm.day0507;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Wangmingcan
 * @date 2021/5/7 15:57
 * @description
 */
public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();
        String[][] old = new String[h][w];
        String[][] ne = new String[h][w];
        for (int i = 0; i < h;i++) {
            for (int j = 0; j < w;j++) {
                int num = sc.nextInt();
                if (num == 0) {
                    old[i][j] = 0+"";
                }else {
                    old[i][j] = num+"-1";
                }
            }
        }
        while(b-- > 0) {
            for (int i = 0; i < h;i++) {
                for (int j = 0; j < w;j++) {
                    String res = old[i][j];
                    res = add(res , old[i][(j+1+w)%w]);
                    res = add(res , old[i][(j-1+w)%w]);
                    res = add(res , old[(i+1+h)%h][j]);
                    res = add(res , old[(i-1+h)%h][j]);
                    res = add(res , old[(i-1+h)%h][(j+1+w)%w]);
                    res = add(res , old[(i-1+h)%h][(j-1+w)%w]);
                    res = add(res , old[(i+1+h)%h][(j+1+w)%w]);
                    res = add(res , old[(i+1+h)%h][(j-1+w)%w]);
                    if (res.equals("0")) {
                        ne[i][j] = res;
                    }else {
                        String[] ss = res.split("-");
                        int fenmu = Integer.valueOf(ss[1])*9;
                        ne[i][j] = ss[0] + "-" + fenmu;
                    }
                }
            }
            for (int i = 0; i < h;i++) {
                for (int j = 0; j < w;j++) {
                    old[i][j] = ne[i][j];
                }
            }
        }
        Set<Double> set = new HashSet<>();
        for (int i = 0; i < h;i++) {
            for (int j = 0; j < w;j++) {
                if (!old[i][j].equals("0")) {
                    String[] res = old[i][j].split("-");
                    set.add((Double.valueOf(res[0])/Double.valueOf(res[1])));
                }else {
                    set.add((double) 0);
                }
            }
        }
        System.out.println(set.size());
    }
    public static String add (String a, String b) {
        int fenzi = 0;
        int fenmu = 0;
        if (a.equals("0")) {
            return b;
        }else if (b.equals("0")) {
            return a;
        }
        String[] sa = a.split("-");
        String[] sb = b.split("-");
        if (sa[1].equals(sb[1])) {
            fenzi = Integer.valueOf(sa[0]) + Integer.valueOf(sb[0]);
            fenmu = Integer.valueOf(sa[1]);
        }else {
            fenzi = Integer.valueOf(sa[0])*Integer.valueOf(sb[1]) + Integer.valueOf(sb[0])*Integer.valueOf(sa[1]);
            fenmu = Integer.valueOf(sa[1]) * Integer.valueOf(sb[1]);
        }
        return fenzi + "-" + fenmu;
    }
}
