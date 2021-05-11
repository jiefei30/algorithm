package acm.exam;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/5 9:18
 * @description
 */

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if ( A > B) {
            for (int i = 0 ; i < A; i++) {
                System.out.print(i + 1L + " ");
            }
            int zheng_he = A*(A+1)/2;
            int fu_he = B*(B-1)/2;
            for (int i = 0; i < B - 1;i++) {
                System.out.print(-1L - i + " ");
            }
            System.out.println(-(zheng_he - fu_he));
        }else if (A < B){
            for (int i = 0 ; i < B; i++) {
                System.out.print(-1L - i + " ");
            }
            int zheng_he = A*(A-1)/2;
            int fu_he = B*(B+1)/2;
            for (int i = 0; i < A - 1;i++) {
                System.out.print(i + 1L + " ");
            }
            System.out.println((fu_he - zheng_he));
        }else {
            for (int i = 0 ; i < A; i++) {
                System.out.print(i + 1L + " ");
                System.out.print(-1L - i + " ");
            }
        }
    }
}
