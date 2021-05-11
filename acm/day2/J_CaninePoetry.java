package acm.day2;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/2 21:47
 * @description
 */
public class J_CaninePoetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String poem = sc.next();
            long res = 0;
            char[] S = poem.toCharArray();
            for (int i = 0; i < poem.length(); i++) {
                if (i > 0 && S[i] == S[i - 1] && S[i] != '0') {
                    S[i] = '0';
                }
                else if(i > 1 && S[i] == S[i - 2] && S[i] != '0') {
                    S[i] = '0';
                }
            }
            for (int i = 0; i < poem.length(); i++) {
                if (S[i] == '0') {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
