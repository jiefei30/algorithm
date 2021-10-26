package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/26 11:14
 * @description 环形链表 II （三个指针）
 */
public class A142 {
    public static void main(String[] args) {

    }

    class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            ListNode res = head;
            while (fast != null && slow != null) {
                fast = fast.next;
                if (fast == null) {
                    break;
                }
                fast = fast.next;
                slow = slow.next;
                if (slow == fast) {
                    while (slow != res) {
                        slow = slow.next;
                        res = res.next;
                    }
                    return res;
                }
            }
            return null;
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
