package acm.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/4 22:07
 * @description
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            int res = 0;
            for (int i = 0; i < n;i++) {
                int cur  = sc.nextInt();
                if (cur >= k) {
                    res++;
                }else {
                    list.add(cur);
                }
            }
            Collections.sort(list);
            boolean isHave = true;
            while (isHave) {
                if (list.size() > 1) {
                    isHave = false;
                    int big = list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    for (int i = 0 ; i < list.size(); i++) {
                        if (big + list.get(i) >= k) {
                            res++;
                            list.remove(i);
                            isHave = true;
                            break;
                        }
                    }
                }else {
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
