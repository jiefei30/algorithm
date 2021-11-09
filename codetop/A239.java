package codetop;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Wangmingcan
 * @date 2021/11/9 15:14
 * @description 滑动窗口最大值
 */
public class A239 {
    public static void main(String[] args) {

    }

    class Solution {
        //单调队列
        public int[] maxSlidingWindow(int[] nums, int k) {
            int[] res = new int[nums.length-k+1];
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            for (int right = 0; right < nums.length; right++) {
                while (queue.size() > 0 && nums[right] > nums[queue.peekLast()]) {
                    queue.pollLast();
                }
                queue.offerLast(right);
                int left = right - k + 1;
                if (left > queue.peekFirst()) {
                    queue.pollFirst();
                }
                if (right + 1 >= k) {
                    res[left] = nums[queue.peekFirst()];
                }
            }
            return res;
        }
        //优先队列（超时）
        public int[] maxSlidingWindow_PriorityQueue(int[] nums, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)-> b-a);
            int[] res = new int[nums.length-k+1];
            for (int i = 0; i < k; i++) {
                queue.offer(nums[i]);
            }
            res[0] = queue.peek();
            for (int i = k, j = 0; i < nums.length; i++,j++) {
                queue.offer(nums[i]);
                queue.remove(nums[j]);
                res[j+1] = queue.peek();
            }
            return res;
        }
    }
}
