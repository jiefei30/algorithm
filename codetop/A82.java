package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/4 13:50
 * @description 删除排序链表中的重复元素 II
 */
public class A82 {
    public static void main(String[] args) {

    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode fake = new ListNode();
            fake.next = head;
            ListNode cur = fake;
            while (cur.next != null && cur.next.next != null) {
                if (cur.next.val == cur.next.next.val) {
                    int x = cur.next.val;
                    while (cur.next != null && cur.next.val == x) {
                        cur.next = cur.next.next;
                    }
                }else {
                    cur = cur.next;
                }
            }
            return fake.next;
        }
    }
}
