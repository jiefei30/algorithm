package leetcode;

import java.math.BigInteger;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

	如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

	您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

	示例：

	输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
	输出：7 -> 0 -> 8
	原因：342 + 465 = 807
	
	
	java.lang.NumberFormatException: For input string: "9999999991"
  at line 68, java.base/java.lang.NumberFormatException.forInputString
  at line 658, java.base/java.lang.Integer.parseInt
  at line 776, java.base/java.lang.Integer.parseInt
  at line 26, Solution.addTwoNumbers
  at line 57, __DriverSolution__.__helper__
  at line 87, __Driver__.main

 * @author DELL
 *
 */
public class 两数相加 {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		 }
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String str1="",str2="",str3="",str4="";
		while(l1!=null) {
			str1+=l1.val;
			l1=l1.next;
		}
		while(l2!=null) {
			str2+=l2.val;
			l2=l2.next;
		}
		for(int i=str1.length()-1;i>=0;i--) {
			str3+=str1.charAt(i-1);
		}
		for(int i=str2.length()-1;i>=0;i--) {
			str4+=str2.charAt(i);
		}
		BigInteger b1 = new BigInteger(str3);
		BigInteger b2 = new BigInteger(str4);
		BigInteger sum = b1.add(b2);
		String res2 = sum.toString();
		ListNode head = null;
		ListNode tail = null;
		for(int i=res2.length()-1;i>=0;i--) {
			if(i == res2.length()-1) {
				head = new ListNode(Integer.parseInt(res2.charAt(i)+""));
				tail = head;
			}else {
				ListNode l3 = new ListNode(Integer.parseInt(res2.charAt(i)+""));
				tail.next = l3;
				tail = l3;
			} 
		}
		return head;
    }
}
