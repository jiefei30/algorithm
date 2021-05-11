package acm.day0508;

import java.util.*;

public class J {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String[]> list  = new ArrayList<>();
		for (int i = 0; i < 5;i++) {
			String op = sc.next();
			String[] ops = new String[2];
			if (op.charAt(1) == '>') {
				ops[0] = op.charAt(0)+"";
				ops[1] = op.charAt(2)+"";
			}else{
				ops[0] = op.charAt(2)+"";
				ops[1] = op.charAt(0)+"";
			}
			list.add(ops);
		}
		boolean flag = false;
		List<String> res = new ArrayList<>();
		while (list.size() > 0) {
			List<String> abcde = new ArrayList<>();
			abcde.add("A");
			abcde.add("B");
			abcde.add("C");
			abcde.add("D");
			abcde.add("E");
			for (int i = 0; i < res.size();i++) {
				for (int j = 0; j < abcde.size();j++) {
					if (res.get(i).equals(abcde.get(j))) {
						abcde.remove(j);
					}else {
						j++;
					}
				}
			}
			for (int i = 0; i < list.size();i++) {
				for (int j = 0; j < abcde.size();) {
					if (abcde.get(j).equals(list.get(i)[0])) {
						abcde.remove(j);
					}else{
						j++;
					}
				}
			}
			if (res.size() == 3) {
				res.add(list.get(0)[1]);
				res.add(list.get(0)[0]);
				break;
			}
			if (abcde.size() > 1) {
				flag = true;
				break;
			}
			res.add(abcde.get(0));
			for (int i = 0; i < list.size();) {
				if (list.get(i)[1].equals(res.get(res.size()-1))) {
					list.remove(i);
				}else{
					i++;
				}
			}
		}
		if (flag) {
			System.out.println("impossible");
		}
		for (int i = 0; i < res.size();i++) {
			System.out.print(res.get(i));
		}
	}
}
