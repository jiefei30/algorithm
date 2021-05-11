package acm.day3;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/3 8:45
 * @description
 */

public class J_AntiSudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            for (int i = 0; i < 9; i++) {
                String row = sc.next();
                int index = 3*(i%3) + i/3;
                int num = Integer.valueOf(row.charAt(index)+"");
                num = (num +1)%9+1;
                System.out.println(row.replace(row.charAt(index) + "",num + ""));
            }
        }
    }
}
