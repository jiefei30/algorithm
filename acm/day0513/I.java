package acm.day0513;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/13 8:18
 * @description
 */
import java.util.Scanner;
public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int index = -1;
        boolean no = false;
        for (int i = 0; i < t.length(); i++) {
            index =s.indexOf(t.charAt(i), index+1);
            if (index < 0) {
                no = true;
                break;
            }
        }
        if (no) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
