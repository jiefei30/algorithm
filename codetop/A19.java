package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/27 19:47
 * @description 删除链表的倒数第 N 个结点
 */
public class A19 {
    public static void main(String[] args) {

    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode prev = findprev(head, n+1);
            if (prev == null) {
                if (head.next != null) {
                    return head.next;
                }
                return null;
            }
            if (prev.next != null) {
                prev.next = prev.next.next;
            }
            return head;
        }

        public ListNode findprev (ListNode head, int k) {
            ListNode fast = head;
            ListNode slow = head;
            while (k-- > 0) {
                if (fast == null) {
                    return null;
                }
                fast = fast.next;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
    }
}
