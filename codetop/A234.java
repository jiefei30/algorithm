package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/13 11:02
 * @description 回文链表
 */
public class A234 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head.next == null) {
                return true;
            }
            ListNode slow = head, fast = head, slowPre = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slowPre = slow;
                slow = slow.next;
            }
            ListNode l2 = slow.next, l1;
            if (fast.next != null) {
                slowPre = slow;
            }
            slowPre.next = null;
            l1 = reverseList(head);
            while (l1 != null && l2 != null) {
                if (l1.val != l2.val) {
                    return false;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
            return true;
        }

        public ListNode reverseList(ListNode head) {
            ListNode prev = null, next = null;
            while (head != null) {
                next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }
    }
}
