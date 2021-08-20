package attack_on_offer;

import java.util.Scanner;

public class A02 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        while(T-- > 0) {
//            long a = sc.nextInt();
//            long b = sc.nextInt();
//            long x = gcd(a,b);
//            long min = 0;
//            if (x < 2) {
//                min = -1;
//            }else {
//                for (int i = 2; i <= x;i++) {
//                    if (x%i==0) {
//                        min = i;
//                        break;
//                    }
//                }
//            }
//            long max = Math.abs(a-b);
//            if (max < 2) {
//                if (min == -1) {
//                    System.out.println(-1 + " " + -1);
//                }else {
//                    System.out.println(min + " " + min);
//                }
//            }else {
//                if (min == -1) {
//                    System.out.println(max + " " + max);
//                }else {
//                    if (min < max) {
//                        System.out.println(min + " " + max);
//                    }else {
//                        System.out.println(max + " " + min);
//                    }
//                }
//            }
//        }
//    }
//
//    public static long gcd(long x,long y){
//        return y==0?x:gcd(y,x%y);
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-- > 0) {
        long a = sc.nextInt();
        long b = sc.nextInt();
        long min = 0;
//        if (x < 2) {
//            min = -1;
//        }else {
//
//        }
        long max = Math.abs(a-b);

    }
}
}
