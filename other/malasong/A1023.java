package other.malasong;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/8/7 8:38
 * @description 长方体
 */
public class A1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int S = a+b+c;
        for (int i = 1; i <= 10000 && i <= S; i++) {
            int x = i;
            for (int j = 1; j <= 10000 && j <= S; j++) {
                int y = j;
                if (x*y == a && (b+c)%(x+y)==0) {
                    int z = (b+c)/(x+y);
                    System.out.println(4*(x+y+z));
                    return;
                }
                if (x*y == b && (a+c)%(x+y)==0) {
                    int z = (a+c)/(x+y);
                    System.out.println(4*(x+y+z));
                    return;
                }
                if (x*y == c && (a+b)%(x+y)==0) {
                    int z = (a+b)/(x+y);
                    System.out.println(4*(x+y+z));
                    return;
                }
            }
        }
    }
}
