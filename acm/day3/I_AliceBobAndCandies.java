package acm.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/3 17:24
 * @description
 */
public class I_AliceBobAndCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            int step = 1;
            int alice= 0;
            int alice_cur= 0;
            int bob= 0;
            int bob_cur= 0;
            int last = -1;
            for (int i = 0 ; i < n;i++) {
                list.add(sc.nextInt());
            }
            while (list.size() > 0) {
                if (step%2 == 1) {
                    alice_cur += list.get(0);
                    alice += list.get(0);
                    list.remove(0);
                    if (alice_cur > last) {
                        last = alice_cur;
                        alice_cur = 0;
                        if (list.size()!=0) {step++;}
                    }
                }else {
                    bob_cur += list.get(list.size()-1);
                    bob += list.get(list.size()-1);
                    list.remove(list.size()-1);
                    if (bob_cur > last) {
                        last = bob_cur;
                        bob_cur = 0;
                        if (list.size()!=0) {step++;}
                    }
                }
            }
            System.out.println(step+" "+alice+" " +bob);
        }
    }
}
