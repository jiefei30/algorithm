package acm.day1;

/**
 * @author Wangmingcan
 * @date 2021/5/1 10:29
 * @description
 */
import java.util.Scanner;
public class A_AlmostRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(;t > 0; t--){
            int x1=-1,x2=0,y1=0,y2=0;
            int n = sc.nextInt();
            String[][] arr = new String[n][n];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                char[] chars = s.toCharArray();
                for (int j = 0; j < n;j++) {
                    if (chars[j] == '*') {
                        if (x1 == -1) {
                            x1 = i;
                            y1 = j;
                        }else {
                            x2 = i;
                            y2 = j;
                        }
                    }
                    arr[i][j] = chars[j] + "";
                }
            }
            if (x1 != x2 && y1 != y2) {
                arr[x1][y2] = "*";
                arr[x2][y1] = "*";
            }else if (x1 == x2){
                if (x1 == 0) {
                    arr[x1+1][y1] = "*";
                    arr[x2+1][y2] = "*";
                }else {
                    arr[x1-1][y1] = "*";
                    arr[x2-1][y2] = "*";
                }
            }else {
                if (y1 == 0) {
                    arr[x1][y1+1] = "*";
                    arr[x2][y2+1] = "*";
                }else {
                    arr[x1][y1-1] = "*";
                    arr[x2][y2-1] = "*";
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}