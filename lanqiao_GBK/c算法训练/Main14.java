package lanqiao_GBK.c算法训练

�㷨ѵ��;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * 
 * ������
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
				if (Character.isDigit(read)) {// ��Ϊȫ�ǷǸ���������Ҫ�жϸ��š�-��,ֻҪ�����־���
					res = read - '0';
					while ((read = reader.read()) != -1) {// �����õ��ܵõ�������
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
