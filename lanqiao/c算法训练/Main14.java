package lanqiao.c算法训练;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * 
 * 审美课
 */
public class Main14 {
	private static Reader reader;
	public static void main(String[] args) {
		reader = new InputStreamReader(System.in);
		int n =getInt();
		int m = getInt();
		
		
	}
	
	public static int getInt() {
		int res = 0, read;
		try {
			while ((read = reader.read()) != -1) {
				if (Character.isDigit(read)) {// 因为全是非负数，不需要判断负号‘-’,只要是数字就行
					res = read - '0';
					while ((read = reader.read()) != -1) {// 继续得到能得到的数字
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
