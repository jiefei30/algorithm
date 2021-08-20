package malasong;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/8/14 14:36
 * @description
 */
public class A1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb  = new StringBuilder();
        for (int i = a; i <= b; i++) {
            String s = i+"";
            boolean isHui = true;
            for (int j = 0; j < s.length()/2; j++) {
                if (s.charAt(j) != s.charAt(s.length()-1-j)) {
                    isHui = false;
                    break;
                }
            }
            if (isHui) {
                boolean isZhi = true;
                for (int j = 2; j <= Math.sqrt(i) ; j++) {
                    if (i % j == 0) {
                        isZhi = false;
                        break;
                    }
                }
                if (isZhi) {
                    sb.append(i + "\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
