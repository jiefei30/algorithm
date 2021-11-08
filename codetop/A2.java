package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/4 8:59
 * @description 两数相加
 */
public class A2 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cul1 = l1;
        ListNode cul2 = l2;
        int l1_len = 0;
        int l2_len = 0;
        while (cul1 != null || cul2 != null) {
            if (cul1 != null) {
                l1_len++;
                cul1 = cul1.next;
            }
            if (cul2 != null) {
                l2_len++;
                cul2 = cul2.next;
            }
        }
        ListNode lon = l1;
        ListNode shor = l2;
        if (l2_len > l1_len) {
            lon = l2;
            shor = l1;
        }
        int yu = 0;
        while (shor != null) {
            lon.val += (shor.val+yu);
            if (lon.val >= 10) {
                yu = 1;
                lon.val -=10;
            }else {
                yu = 0;
            }
            shor = shor.next;
            if (lon.next == null && yu == 1) {
                lon.next = new ListNode(0);
            }
            lon = lon.next;
        }
        while (yu == 1) {
            lon.val += 1;
            if (lon.val >= 10) {
                yu = 1;
                lon.val -= 10;
                if (lon.next == null) {
                    lon.next = new ListNode(0);
                }
                lon = lon.next;
            }else {
                yu = 0;
            }
        }
        if (l2_len > l1_len) {
            return l2;
        }
        return l1;
    }
}
