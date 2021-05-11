package acm.day1;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/1 19:43
 * @description
 */

public class B_ABPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int length = a+b;
            int a1=0,b1=0;
            boolean not = false;
            String s = sc.next();
            char[] chars = s.toCharArray();
            for (int i = 0; i < length/2;i++) {
                if (chars[i] == '0') {
                    if (chars[length-i-1] == '1') {
                        not = true;
                        break;
                    }
                    a1+=2;
                    chars[length-i-1] = '0';
                }else if (chars[i] == '1') {
                    if (chars[length-i-1] == '0') {
                        not = true;
                        break;
                    }
                    b1+=2;
                    chars[length-i-1] = '1';
                }else {
                    if (chars[length-i-1] == '0') {
                        a1+=2;
                        chars[i] = '0';
                    }else if (chars[length-i-1] == '1') {
                        b1+=2;
                        chars[i] = '1';
                    }
                }
            }
            if (not) {
                System.out.println(-1);
                continue;
            }
            if (length % 2 == 1) {
                if (chars[length/2] == '0') {
                    a1++;
                }else if (chars[length/2] == '1'){
                    b1++;
                }else {
                    if (a % 2 == 1) {
                        chars[length/2] = '0';
                        a1++;
                    }else {
                        chars[length/2] = '1';
                        b1++;
                    }
                }
            }
            if (a1 > a || b1 > b) {
                System.out.println(-1);
                continue;
            }
            if ((a - a1) %2 !=0 || (b - b1) %2 != 0) {
                System.out.println(-1);
                continue;
            }else {
                for (int i = 0; i < length; i++) {
                    if (chars[i] == '?') {
                        if (a1 < a) {
                            chars[i] = chars[length - i -1] = '0';
                            a1+=2;
                        }else {
                            chars[i] = chars[length - i -1] = '1';
                            b1+=2;
                        }
                    }
                }
            }

            for (int i = 0; i < length; i++) {
                System.out.print(chars[i] + "");
            }
            System.out.println();
        }
    }
}
