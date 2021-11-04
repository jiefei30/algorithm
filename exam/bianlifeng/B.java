package exam.bianlifeng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sarr = s.split(";");
        int[][] arr = new int[sarr.length][3];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = Integer.valueOf(String.valueOf(sarr[i].charAt(1)));
            arr[i][1] = Integer.valueOf(String.valueOf(sarr[i].charAt(3)));
            arr[i][2] = Integer.valueOf(String.valueOf(sarr[i].charAt(5)));
        }
        Arrays.sort(arr, (a,b) -> a[1] - b[1]);
        int lenth = 0;
        for (int i = 0; i < arr.length; i++) {
            lenth = Math.max(lenth, arr[i][2]);
        }
        int[] res = new int[lenth+1];
        int cur = 0;
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i-1];
            while (cur < arr.length && i == arr[cur][1]) {
                res[i] += arr[cur][0];
                cur++;
            }
        }
        int sub = 0;
        cur = 0;
        int ans = 0;
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            while (cur < arr.length && i == arr[cur][2]) {
                sub += arr[cur][0];
                cur++;
            }
            res[i] -= sub;
            if (res[i] > ans) {
                pos = new ArrayList<>();
                pos.add(i);
                ans = res[i];
            }else if (res[i] == ans) {
                pos.add(i);
            }
        }
        System.out.println(ans);
        for (int i = 0; i < pos.size() - 1; i++) {
            System.out.print(pos.get(i)+",");
            System.out.print(pos.get(pos.size()-1));
        }
    }
}
