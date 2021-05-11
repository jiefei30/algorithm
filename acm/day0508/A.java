package acm.day0508;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/8 15:03
 * @description
 */
public class A {
    static int all;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        all = sc.nextInt();
        String op = sc.next();
        char[][] arr = new char[all][];
        for (int i = 0; i < all; i++) {
            arr[i] = sc.next().toCharArray();
        }
        char[] ops = op.toCharArray();
        for (int i = 0; i < ops.length; i++) {
            map.put(ops[i], map.getOrDefault(ops[i], 0) + 1);
        }
        int rNum = map.getOrDefault('R',0);
        int lNum = map.getOrDefault('L',0);
        int num = Math.abs(rNum - lNum) % 4;
        char finalOp = rNum > lNum ? 'R':'L';
        if(num == 3 && finalOp == 'L') {
            num = 1;
            finalOp = 'R';
        }
        if(num == 3 && finalOp == 'R') {
            num = 1;
            finalOp = 'L';
        }
        trans(arr, num, finalOp);
    }

    public static void trans(char[][] arr,int n,char finalOp) {
        if(n == 0) {
            for (int i = 0; i < all; i++) {
                for (int j = 0; j < all; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        if (n == 1 && finalOp == 'L') {
            for (int i = all -1; i >= 0; i--) {
                for (int j = 0; j < all; j++) {
                    if(arr[j][i] == '>')
                        System.out.print('^');
                    else if(arr[j][i] == '<')
                        System.out.print('v');
                    else if(arr[j][i] == '^')
                        System.out.print('<');
                    else if(arr[j][i] == 'v')
                        System.out.print('>');
                    else
                        System.out.print(arr[j][i]);
                }
                System.out.println();
            }
        }
        if (n == 1 && finalOp == 'R') {
            for (int i = 0; i < all; i++) {
                for (int j = all - 1; j >= 0; j--) {
                    if(arr[j][i] == '>')
                        System.out.print('v');
                    else if(arr[j][i] == '<')
                        System.out.print('^');
                    else if(arr[j][i] == '^')
                        System.out.print('>');
                    else if(arr[j][i] == 'v')
                        System.out.print('<');
                    else
                        System.out.print(arr[j][i]);
                }
                System.out.println();
            }
        }
        if (n == 2) {
            for (int i = all - 1; i >= 0; i--) {
                for (int j = 0; j < all; j++) {
                    if(arr[i][j] == '>')
                        System.out.print('<');
                    else if(arr[i][j] == '<')
                        System.out.print('>');
                    else if(arr[i][j] == '^')
                        System.out.print('v');
                    else if(arr[i][j] == 'v')
                        System.out.print('^');
                    else
                        System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}
