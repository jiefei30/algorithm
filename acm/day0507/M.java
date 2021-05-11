package acm.day0507;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/7 10:37
 * @description
 */
public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        List<Long> list = new ArrayList<>();
        for (int i = 0;i < 100;i++) {
            list.add(i+1L);
        }
        for (int i = 0; i < n;i++) {
            String operation = sc.next();
            int num = sc.nextInt();
            if (operation.equals("ADD")) {
                for (int j = 0 ; j < list.size();j++) {
                    list.set(j, list.get(j) + num);
                }
            }else if (operation.equals("MULTIPLY")) {
                for (int j = 0 ; j < list.size();j++) {
                    list.set(j, list.get(j)*num);
                }
            }else if (operation.equals("SUBTRACT")) {
                for (int j = 0 ; j < list.size();) {
                    if (list.get(j) - num< 0) {
                        list.remove(j);
                        res++;
                    }else {
                        list.set(j, list.get(j) - num);
                        j++;
                    }
                }
            }else {
                for (int j = 0 ; j < list.size();) {
                    if (list.get(j)%num != 0) {
                        list.remove(j);
                        res++;
                    }else {
                        list.set(j, list.get(j)/num);
                        j++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
