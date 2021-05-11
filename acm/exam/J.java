package acm.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/5 10:04
 * @description
 */
public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xor = a^b;
            String sa = Integer.toBinaryString(a);
            String sb = Integer.toBinaryString(b);
            String max = sb;
            if (sa.length() > sb.length()) {
                max = sa;
            }
            String s = Integer.toBinaryString(xor);
            StringBuilder stringBuilder = new StringBuilder("");
            for (int i = 0 ; i < max.length() - s.length();i++) {
                stringBuilder.append("0");
            }
            s = stringBuilder.toString() + s;
            List<Integer> list = new ArrayList<>();
            for (int i = 0 ; i < s.length();i++) {
                if (s.charAt(i) == '0') {
                    list.add(i);
                }
            }
            if (list.size() == 0) {
                System.out.println("No");
                continue;
            }
            boolean isHave = false;
            for (int i = 0; i < list.size();i++) {
                if (max.charAt(list.get(i)) == '1') {
                    System.out.println("Yes");
                    isHave = true;
                    break;
                }
            }
            if (!isHave) {
                System.out.println("No");
            }
        }
    }
}
