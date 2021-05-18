package other.simulatedCompetition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n;
		int[] a2;
		boolean input=true;
		ArrayList<Integer> a1 = new ArrayList<Integer>();

		for(int i=0;i<T;i++) {
			int b = sc.nextInt();
			a1.add(b);
			for(int j=0;j<b;j++) {
				a1.add(sc.nextInt());
			}
		}
		for(int i = 0;i<T;i++) {
			n = a1.get(0);
			a1.remove(0);
			a2 = new int[n];
			for(int j=0;j<n;j++) {
				a2[j]=a1.get(0);
				a1.remove(0);
			}
			Arrays.sort(a2);
			if(a2[0]!=0) {
				System.out.println(0);
			}else {
				for(int k=0;k<n-1;k++) {
					if(a2[k+1]==a2[k] || a2[k+1]==a2[k]+1) {
					}else {
						System.out.println(a2[k]+1);
						input =false;
						break;
					}
				}
				if(input) System.out.println(a2[n-1]+1);
			}
		}
	}
}
