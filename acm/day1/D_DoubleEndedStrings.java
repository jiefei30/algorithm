package acm.day1;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/1 16:06
 * @description
 */

public class D_DoubleEndedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int res = 1000000001;
            String a = sc.next();
            String b = sc.next();
            if (a.length() <= b.length()) {
                String temp = a;
                a = b;
                b = temp;
            }
            for (int i = 0; i < b.length(); i++) {
                for (int j = i+1; j <= b.length();j++) {
                    if (a.indexOf(b.substring(i,j))> -1) {
                        int l = j-i;
                        int cur = a.length() + b.length() - 2*l;
                        res = res>cur?cur:res;
                    }
                }
            }
            if (res==1000000001) {
                System.out.println(a.length()+b.length());
            }else {
                System.out.println(res);
            }

        }
    }
}
