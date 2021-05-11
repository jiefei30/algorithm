package other.周算法题;



import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		String result = Integer.toBinaryString(new Scanner(System.in).nextInt());
		if(result.contains(1+"")) {
			if(result.length()==1) {
				System.out.println(true);
			}else {
				if(result.substring(1, result.length()-1).contains(1+"") || result.length()%2==0) 
					System.out.println(false);
				else System.out.println(true);
			}
		}else System.out.println(false);
	}
}
