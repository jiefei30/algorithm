package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/20 14:38
 * @description 删除排序链表中的重复元素
 */
public class A83 {
    public static void main(String[] args) {

    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode node = head;
            while (node != null) {
                ListNode cur = node.next;
                while (cur != null && node.val == cur.val) {
                    cur = cur.next;
                }
                node.next = cur;
                node = node.next;
            }
            return head;
        }
    }
}
