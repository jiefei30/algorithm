package codetop;

/**
 * @author Wangmingcan
 * @date 2021/8/25 20:43
 * @description K 个一组翻转链表
 */
public class A25 {
    public static void main(String[] args) {

    }
}

class Solution25 {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode first = head;
//        int length = 0;
//        while (first != null) {
//            length++;
//            first = first.next;
//        }
//        int round = length/k;
//        ListNode last = null;
//        ListNode result = head;
//        for (int i = 0; i < round;i++) {
//            ListNode prev = null;
//            ListNode curr = head;
//            for (int j = 0; j < k && curr != null; j++) {
//                ListNode nextTemp = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = nextTemp;
//            }
//            if (last == null) {
//                last = head;
//            }else {
//                last.next = prev;
//                last = head;
//            }
//            head = prev.next;
//            if (i == 0) {
//                result = prev;
//            }
//        }
//        return result;
//    }

    /**
     * 链表翻转函数（头、尾） + 递归
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        // 如果头节点为null或者节点只有一个直接返回
        if (head == null || head.next == null) {
            return head;
        }
        //保存每一段反转的头尾指针
        ListNode tail = head;
        //循环k次，找到尾部
        for (int i = 0; i < k; i++) {
            //如果不够k个就结束了，这一段不反转直接返回头部
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        //反转后记录这一段的头部
        ListNode newHead = reverse(head, tail); // [ )
        //这里的head其实按这一段的顺序已经是指向尾部了
        // 这里的head.next需要指向下一段的头部（就是它反转后的tail）
        //每一段反转后，一开始的head最后指向尾，一开始的tail最后指向头
        head.next = reverseKGroup(tail, k);
        return newHead;
    }

    /**
     * 根据头尾指针反转
     *  每一段反转后，一开始的head最后指向尾，一开始的tail最后指向头
     */
    public ListNode reverse(ListNode head, ListNode tail) {
        ListNode pre = null, next = null;
        while (head != tail) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}