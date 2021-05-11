package acm.exam;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/5 8:51
 * @description
 */
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int res = 1;
            String[] di =new String[4];
            di[0] = "N";
            di[1] = "E";
            di[2] = "S";
            di[3] = "W";
            for (int i = 0; i < s.length();i++) {
                if (s.charAt(i) == '1') {
                    if (res == 0) {
                        res = 3;
                    }else {
                        res = (res - 1)%4;
                    }
                }else{
                    res = (res + 1)%4;
                }
            }
            System.out.println(di[res]);
        }
    }
}
