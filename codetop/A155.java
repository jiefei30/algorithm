package codetop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/11/12 9:44
 * @description 最小栈
 */
public class A155 {
    public static void main(String[] args) {

    }

    class MinStack {

        ArrayDeque<Integer> stack;
        ArrayDeque<Integer> minStack;

        public MinStack() {
            stack = new ArrayDeque<>();
            minStack = new ArrayDeque<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            stack.push(val);
            minStack.push(Math.min(val, minStack.peekFirst()));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peekFirst();
        }

        public int getMin() {
            return minStack.peekFirst();
        }
    }
}
