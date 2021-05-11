package acm.day2;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/2 8:48
 * @description
 */

public class B_ABCString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String a = sc.next();
            char[] chars = a.toCharArray();
            char[] chars2 = new char[a.length()];
            if (chars[0] == chars[a.length()-1]) {
                System.out.println("NO");
                continue;
            }
            char begin = chars[0];
            char end = chars[a.length()-1];
            for (int i = 0; i < a.length(); i++) {
                if (begin == chars[i]) {
                    chars[i] = '(';
                    chars2[i] = '(';
                }else if (end == chars[i]) {
                    chars[i] = ')';
                    chars2[i] = ')';
                }else {
                    chars[i] = '(';
                    chars2[i] = ')';
                }
            }
            String res = String.valueOf(chars);
            int res_length = res.length();
            String res2 = String.valueOf(chars2);
            int res2_length = res.length();
            while(res.length() > 0){
                res = res.replace("()","");
                if (res.length() != res_length) {
                    res_length = res.length();
                }else{
                    break;
                }
            }
            while(res2.length() > 0){
                res2 = res2.replace("()","");
                if (res2.length() != res2_length) {
                    res2_length = res2.length();
                }else{
                    break;
                }
            }
            if (res.length() > 0 && res2.length() > 0) {
                System.out.println("NO");
            }else {
                if (res.length() == 0) {
                    System.out.println("YES");
                }else if (res2.length() == 0) {
                    System.out.println("YES");
                }
            }
        }
    }
}
