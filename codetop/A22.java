package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/27 16:02
 * @description 剑指 Offer 22. 链表中倒数第k个节点
 */
public class A22 {
    public static void main(String[] args) {

    }

    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode fast = head;
            ListNode slow = head;
            while (k-- > 0) {
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
