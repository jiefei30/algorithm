package other.malasong;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/8/14 14:58
 * @description
 */
public class A1028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            for (int i = 1; i <= a ; i++) {
                for (int j = 0; j < a-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
