package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/26 20:13
 * @description 重排链表 （寻找链表中点 + 链表逆序 + 合并链表）
 */
public class A143 {
    public static void main(String[] args) {

    }

    class Solution {
        public void reorderList(ListNode head) {
            if (head == null) {
                return;
            }
            ListNode mid = middleList(head);
            ListNode l2 = reverseList(mid);
            mergeList(head, l2);
        }

        public ListNode middleList(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        public ListNode reverseList(ListNode head) {
            ListNode prev = null, next;
            while (head != null) {
                next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }

        public void mergeList(ListNode l1, ListNode l2) {
            ListNode l1_t, l2_t;
            while (l1 != null && l2 != null) {
                l1_t = l1.next;
                l1.next = l2;
                l1 = l1_t;

                l2_t = l2.next;
                l2.next = l1;
                l2 = l2_t;
            }
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
