package other.模拟赛;


import java.util.Scanner;

public class 字符串查找 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		while (s.indexOf("kunkun") >= 0) {
			int x = s.indexOf("kunkun");
			s = s.substring(x + 5);
			count++;
		}
		System.out.println(count);
	}

}
