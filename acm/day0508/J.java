package acm.day0508;

import java.util.*;

public class J {
	static char[][] ops = new char[5][2];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5;i++) {
			String op = sc.next();
			if (op.charAt(1) == '>') {
				ops[i][0] = op.charAt(0);
				ops[i][1] = op.charAt(2);
			}else{
				ops[i][0] = op.charAt(2);
				ops[i][1] = op.charAt(0);
			}
		}
		perm(new char[]{'A','B','C','D','E'},0,4);
		System.out.println("impossible");
	}

	public static void perm(char[] array, int start, int end) {
		for (int i = start; i <= end; i++) {
			if (check(array)) {
				for (int j = 0; j < 5; j++) {
					System.out.print(array[4-j]);
				}
				System.exit(0);
			}
			swap(array,start,i);
			perm(array,start+1,end);
			swap(array,start,i);
		}
	}

	public static void swap(char[] array,int i,int j) {
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static boolean check(char[] array) {
		boolean flag = true;
		String s = new String(array);
		for (int i = 0; i < 5; i++) {
			int first = s.indexOf(ops[i][0]);
			if (first > -1) {
				int end = s.indexOf(ops[i][1], first+1);
				if (end < 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
}
