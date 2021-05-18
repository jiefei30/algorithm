package acm.day0517;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/17 16:22
 * @description
 */
public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] map = new char[m][n];
        boolean[][] used = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = sc.next().toCharArray();
        }
        Queue<Integer[]> queue = new LinkedList();
        queue.offer(new Integer[]{0,0,0});
        while(queue.size() > 0){
            Integer[] cur = queue.poll();
            if (!used[cur[0]][cur[1]]) {
                int step = Integer.valueOf(map[cur[0]][cur[1]]+"");
                //下
                if (cur[0] + step == m-1 && cur[1] == n-1) {
                    System.out.println(cur[2]+1);
                    return;
                }else {
                    if (cur[0] + step <m) {
                        queue.offer(new Integer[]{cur[0] + step,cur[1],cur[2]+1});
                    }
                }
                //右
                if (cur[0] == m-1 && cur[1] + step == n-1) {
                    System.out.println(cur[2]+1);
                    return;
                }else {
                    if (cur[1] + step < n) {
                        queue.offer(new Integer[]{cur[0],cur[1]+step,cur[2]+1});
                    }
                }
                //上
                if (cur[0] - step >= 0) {
                    queue.offer(new Integer[]{cur[0] - step,cur[1],cur[2]+1});
                }
                //左
                if (cur[1] - step >= 0) {
                    queue.offer(new Integer[]{cur[0],cur[1]-step,cur[2]+1});
                }
                used[cur[0]][cur[1]] = true;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
