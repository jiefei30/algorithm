package other.weeklyAlgorithm;

import java.util.Scanner;

public class Student2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ĸ�����");
		int n = sc.nextInt();
		int[][] mark = new int[n][2];
		String[] name = new String[n];
		for(int i=0;i<n;i++) mark[i][0]=i;
		System.out.println("����������ѧ���������ͷ������м��ÿո������ÿ��ѧ��Ϊһ��");
		for(int i=0;i<n;i++) {
			name[i] = sc.next();
			mark[i][1] = sc.nextInt();
		}
		int[][] change = new int[1][1];
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(mark[j][1]<mark[j+1][1]) {
					change[0] = mark[j+1];
					mark[j+1] = mark[j];
					mark[j] = change[0];
				}
			}
		}
		System.out.println("ѧ���ɼ��Ӵ�С�����ǣ�");
		for(int i=0;i<n;i++) 	System.out.println(name[mark[i][0]] + " "+mark[i][1]);
	}
}
