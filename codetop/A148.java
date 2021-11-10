package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/4 14:45
 * @description 排序链表 （自底向上归并排序）
 */
public class A148 {
    public static void main(String[] args) {

    }

    class Solution {

        public ListNode sortList(ListNode head) {
            return sort(head, null);
        }

        private ListNode sort(ListNode start, ListNode end) {
            if (start == end) {
                return start;
            }
            ListNode fast = start, slow = start;
            while (fast != end && fast.next != end) {
                fast = fast.next.next;
                slow = slow.next;
            }
            ListNode l2 = sort(slow.next, end);
            slow.next = null;
            ListNode l1 = sort(start, slow);
            return mergeTwoLists(l1, l2);
        }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null || l2 == null) {
                return l1 == null ? l2 : l1;
            }
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }else {
                l2.next = mergeTwoLists(l2.next, l1);
                return l2;
            }
        }
    }
}
