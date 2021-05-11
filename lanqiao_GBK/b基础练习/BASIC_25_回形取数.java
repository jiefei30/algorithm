package lanqiao_GBK.b基础练习

������ϰ;
/**
 *  ����ȡ���������Ƚ��鷳��
 */

public class BASIC_25_����ȡ�� {
	private static Reader reader;
	private static Writer writer;
	public static void main(String[] args) throws IOException {
		reader = new InputStreamReader(System.in);
		writer = new OutputStreamWriter(System.out);
		int direction = 1;
		Scanner sc = new Scanner(System.in);
		int m =getInt();
		int n=getInt();
		int[][] chess = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				chess[i][j]=getInt();
			}
		}
		int row=0,col=0,up=0,left=0,down=m-1,right=n-1;
		for(int i=0;i<m*n;i++) {
			if(direction==1 && row<=down) {
				out(chess[row][col]);
				if(row<down) {
					row++;
				}else {
					direction++;
					left++;
					col++;
				}
			}else if(direction==2 && col<=right ) {
				out(chess[row][col]);
				if(col<right) {
					col++;
				}else {
					direction++;
					down--;
					row--;
				}
			}else if(direction==3 && row>=up) {
				out(chess[row][col]);
				if(row>up) {
					row--;
				}else {
					direction++;
					right--;
					col--;
				}
			}else if(direction==4 && col>=left) {
				out(chess[row][col]);
				if(col>left) {
					col--;
				}else {
					direction=1;
					up++;
					row++;
				}
			}
		}
	}
	public static void out(int n) throws IOException {
		writer.write(n+" ");
		writer.flush();
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
