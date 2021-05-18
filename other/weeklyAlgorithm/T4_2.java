package other.weeklyAlgorithm;

/**
 * Լɪ������
 * ����+����
 */
import java.util.ArrayList;
import java.util.Scanner;

public class T4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int index=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0,t=1;i<n;i++,t++) {
			arr.add(t);
		}
		while(arr.size()>0) {
			for(int i=0;i<m;i++) {
				if(i==m-1) {
					System.out.println(arr.get(index));
					arr.remove(index);
					if(index > arr.size()-1) index=0; 
					break;
				}
				index++;
				if(index > arr.size()-1) index=0; 
			}
		}
	}
}
