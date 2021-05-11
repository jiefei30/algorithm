package acm.day0510;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/10 15:47
 * @description
 */
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 2*100000+10;
        int n = sc.nextInt();
        int[] cx = new int[max];
        int[] cy = new int[max];
        long res_x = 0;
        long res_y = 0;
        for (int i = 0; i < n;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            cx[x]++;
            cy[y]++;
            if (cx[x]==1) {
                res_x += 4;
            }else {
                res_x += 2;
            }
            if (cy[y]==1) {
                res_y += 4;
            }else {
                res_y += 2;
            }
            if (cx[x-1] >= cx[x]) {
                res_x-=2;
            }
            if (cx[x+1] >= cx[x]) {
                res_x-=2;
            }
            if (cy[y-1] >= cy[y]) {
                res_y-=2;
            }
            if (cy[y+1] >= cy[y]) {
                res_y-=2;
            }
            System.out.println(res_x + " "+res_y);
        }
    }
}
