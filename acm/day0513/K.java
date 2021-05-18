package acm.day0513;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/13 15:57
 * @description
 */
import java.util.Scanner;
public class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        if (l != 2) {
            System.out.println("No");
        }else {
            if (k <= 3) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
