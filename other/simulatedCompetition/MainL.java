package other.simulatedCompetition;

import java.util.Scanner;

public class MainL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int total=0;
		for(int i=0;i<n;i++) {
			total = total+sc.nextInt();
		}
		if(total>0) {
			System.out.println("icebound is happy.");
		}else if(total==0) {
			System.out.println("icebound is ok.");
		}else System.out.println("icebound is sad.");
	}
}
