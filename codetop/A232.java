package codetop;

import java.util.Stack;

/**
 * @author Wangmingcan
 * @date 2021/10/28 14:53
 * @description 用栈实现队列
 */
public class A232 {
    public static void main(String[] args) {

    }

    class MyQueue {

        private Stack<Integer> s1 = new Stack<>();
        private Stack<Integer> s2 = new Stack<>();
        private int front;

        public MyQueue() {

        }

        public void push(int x) {
            if (s1.empty()) {
                front = x;
            }
            s1.push(x);
        }

        public int pop() {
            if (s2.empty()) {
                while(!s1.empty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        public int peek() {
            if (s2.empty()) {
                return front;
            }else {
                return s2.peek();
            }
        }

        public boolean empty() {
            return s1.empty() && s2.empty();
        }
    }
}
