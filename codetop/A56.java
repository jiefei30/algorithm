package codetop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/10/27 20:13
 * @description 合并区间
 */
public class A56 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[][] merge(int[][] intervals) {
            List<int[]> res = new ArrayList<>();
            if (intervals.length == 0) {
                return new int[0][2];
            }
            if (intervals.length == 1) {
                return intervals;
            }
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            for (int i = 0; i < intervals.length - 1;i++) {
                int left = intervals[i][0];
                int right = intervals[i][1];
                while (right >= intervals[i+1][1] || right >= intervals[i+1][0]) {
                    if (right < intervals[i+1][1]) {
                        right = intervals[i+1][1];
                    }
                    i++;
                    if (i == intervals.length - 1) {
                        break;
                    }
                }
                int[] temp = new int[]{left, right};
                res.add(temp);
            }
            if (res.get(res.size() - 1)[1] < intervals[intervals.length -1][1]) {
                res.add(intervals[intervals.length -1]);
            }
            return res.toArray(new int[0][]);
        }
    }
}
