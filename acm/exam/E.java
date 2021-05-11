package acm.exam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Wangmingcan
 * @date 2021/5/5 10:29
 * @description
 */
public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n;i++) {
                arr[i] = sc.nextInt();
            }
            int res = 0;
            for (int i = 0; i < n;i++) {
                int cur = 0;
                if (arr[i] <= k) {
                    cur ++;
                    Set<Integer> has = new HashSet<>();
                    int mine = arr[i];
                    has.add(arr[i]);
                    for (int j = i+1; j < n;j++) {
                        if (has.contains(arr[j])) {
                            cur ++;
                        }else if (mine + arr[j] <= k){
                            cur++;
                            mine += arr[j];
                            has.add(arr[j]);
                        }else {
                            break;
                        }
                    }
                    res = res > cur?res:cur;
                }else {
                    continue;
                }
            }
            System.out.println(res);
        }
    }
}
