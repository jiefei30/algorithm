package acm.day3;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/3 19:56
 * @description
 */
public class H_UniversalSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int r = 0;
            int s = 0;
            int p = 0;
            String str = sc.next();
            for (int i = 0; i < str.length();i++) {
                if (str.charAt(i) == 'R') {
                    r++;
                }else if (str.charAt(i) == 'S') {
                    s++;
                }else {
                    p++;
                }
            }
            String max = "";
            if (r >= s && r >= p) {
                max = "P";
            }else if (s >= r && s >= p) {
                max = "R";
            }else {
                max = "S";
            }
            StringBuilder res = new StringBuilder("");
            for (int i = 0; i < str.length();i++) {
                res.append(max);
            }
            System.out.println(res.toString());
        }
    }
}
