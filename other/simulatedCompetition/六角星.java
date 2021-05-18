package other.simulatedCompetition;

import java.util.Scanner;

public class 六角星 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("*");
			return;
		}
		int hight = 4*n-3;
		int width = 6*n-5;
		for(int i=hight-1;i>=0;i--) {
			for(int j=width-1;j>=0;j--) {
				if((j%2==1)&&((j-i==n-1)||(j-i==2*n-1)
						||(i+j==2*n-1)||(i+j==4*n-1))) System.out.print("*");
				else if((j%2==0)&&((i==n-1)||(i==2*n-1))) {
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
