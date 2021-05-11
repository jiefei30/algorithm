package acm.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/2 19:35
 * @description
 */

public class G_EvenOddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Long> list = new ArrayList<>();
            Long alice = 0L;
            Long bob = 0L;
            for (int i = 0; i < n; i++) {
                Long a = sc.nextLong();
                list.add(a);
            }
            Collections.sort(list);
            while (list.size() > 0) {
                if (list.get(list.size()-1)%2==0) {
                    alice += list.get(list.size()-1);
                }
                list.remove(list.size()-1);
                if (list.size()>0) {
                    if (list.get(list.size()-1)%2==1) {
                        bob += list.get(list.size()-1);
                    }
                    list.remove(list.size()-1);
                }
            }
            if (alice > bob) {
                System.out.println("Alice");
            }else if (alice < bob){
                System.out.println("Bob");
            }else {
                System.out.println("Tie");
            }
        }
    }
}
