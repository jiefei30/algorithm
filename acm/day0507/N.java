package acm.day0507;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/7 10:20
 * @description
 */
public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int safe = 1;
        int broken = k;
        for (int i = 0; i < n;i++) {
            int floor = sc.nextInt();
            String s = sc.next();
            if (s.equals("SAFE")) {
                safe = floor > safe?floor:safe;
            }else {
                broken = floor < broken?floor:broken;
            }
        }
        int res = broken -1;
        System.out.println(safe+1 + " " + res);
    }
}
