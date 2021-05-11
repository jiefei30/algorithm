package lanqiao_GBK.b基础练习

������ϰ;
/**
 * 
 * �׳˼��� 
 */

public class BASIC_30_�׳˼��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		char[] charA = a.toCharArray();
		int[] A = new int[a.length()];
		for(int i=0;i<a.length();i++) {
			A[i] = Integer.parseInt(charA[i]+"");
		}
		
	}
}
