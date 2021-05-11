package acm.day0507;

import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/7 8:30
 * @description
 */

public class R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TNode root = new TNode();
        root.value[0] = sc.next();
        root.value[1] = sc.next();
        while (--n > 0) {
            TNode tNode = new TNode();
            tNode.value[0] = sc.next();
            tNode.value[1] = sc.next();
            add(root, tNode);
        }
        sout(root);
    }

    public static void add (TNode root, TNode cur) {
        if (judge(root.value[1], cur.value[1]) == 1) {
            if (root.right == null) {
                root.right = cur;
            }else {
                add(root.right, cur);
            }
        }else if (judge(root.value[1], cur.value[1]) == -1) {
            if (root.left == null) {
                root.left = cur;
            }else {
                add(root.left, cur);
            }
        }else {
            if (judge(root.value[0], cur.value[0]) == 1) {
                if (root.right == null) {
                    root.right = cur;
                }else {
                    add(root.right, cur);
                }
            }else if (judge(root.value[0], cur.value[0]) == -1) {
                if (root.left == null) {
                    root.left = cur;
                }else {
                    add(root.left, cur);
                }
            }
        }
    }

    public static Integer judge(String s, String t) {
        int res = 0;
        int i = 0;
        for (; i < s.length() && i < t.length();i++) {
            if (s.charAt(i) > t.charAt(i)) {
                res =  -1;
                break;
            }else if (s.charAt(i) < t.charAt(i)) {
                res = 1;
                break;
            }
        }
        if (res == 0) {
            if (s.length() == t.length()) {
                res = 0;
            }else if (s.length() > t.length()) {
                res = -1;
            }else {
                res = 1;
            }
        }
        return res;
    }

    public static void sout(TNode t) {
        if (t.left != null) {
            sout(t.left);
        }
        System.out.println(t.value[0] + " " + t.value[1]);
        if (t.right != null) {
            sout(t.right);
        }
    }
}

class TNode {
    public TNode left;
    public TNode right;
    public String[] value = new String[2];
}
