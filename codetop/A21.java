package codetop;

import java.util.PriorityQueue;

/**
 * @author Wangmingcan
 * @date 2021/10/16 15:07
 * @description 合并两个有序链表
 */
public class A21 {
    public static void main(String[] args) {

    }

    class Solution1 {
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

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
