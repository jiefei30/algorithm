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
            if (head == null || head.next == null) {
                return head;
            }
            int length = 0;
            ListNode temp = head;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
            int subLength = 1;
            while (subLength < length) {

            }

            return null;
        }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
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
