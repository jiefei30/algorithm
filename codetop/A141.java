package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/16 14:45
 * @description 环形链表
 */
public class A141 {
    public static void main(String[] args) {

    }

    class Solution141 {
        public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            while (head != null && fast != null) {
                head = head.next;
                fast = fast.next;
                if (fast != null) {
                    fast = fast.next;
                }else {
                    break;
                }
                if (head == fast) {
                    return true;
                }
            }
            return false;
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
