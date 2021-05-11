package lanqiao_GBK.c算法训练

�㷨ѵ��;
/**
 * (����K������ѯ
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
public class ALGO_001 {
	private static Reader reader;
	public static void main(String[] args) {
		reader = new InputStreamReader(System.in);
		int n=getInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = getInt();
		}
		int m = getInt();
		int[][] test = new int[m][3];
		for(int i=0;i<m;i++) {
			for(int j=0;j<3;j++) {
				test[i][j] = getInt();
			}
		}
		int[] compare;
		for(int i=0;i<m;i++) {
			compare = new int[test[i][1]-test[i][0]+1];
			for(int k=0,j=test[i][0];j<=test[i][1];j++,k++) {
				compare[k]=arr[j-1];
			}
			Arrays.sort(compare);
			System.out.println(compare[compare.length-test[i][2]]);
		}
	}
	public static int getInt() {
		int res = 0, read;
		try {
			while ((read = reader.read()) != -1) {
				if (Character.isDigit(read)) {
					res = read - '0';
					while ((read = reader.read()) != -1) {
						if (Character.isDigit(read)) {
							res = res * 10 + (read - '0');
						} else {
							break;
						}
					}
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
}
