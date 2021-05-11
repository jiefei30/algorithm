package other.模拟赛;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
public class quicklyInOut {
	private static Reader reader = null;
	private static Writer writer = null;
	public static void main(String[] args) {

		 reader = new InputStreamReader(System.in);
	        writer = new OutputStreamWriter(System.out);
	        int n = getInt();
	        try {
	            for (int i = 1; i <= n; i++) {
	                int m, max = 0, sum, st, en, p;
	                int a;
	                if (i != 1) {
	                    writer.write("\r\n");
	                    writer.flush();
	                }
	                m = getInt();
	                sum = 0;
	                st = en = p = 0;
	                for (int j = 0; j < m; j++) {
	                    a = getInt();
	                    if (j == 0) {
	                        max = a;
	                    }
	                    sum += a;
	                    if (sum > max) {
	                        max = sum;
	                        st = p;
	                        en = j;
	                    }
	                    if (sum < 0) {
	                        sum = 0;
	                        p = j + 1;
	                    }
	                }
	                st++;
	                en++;
	                writer.write("Case " + i + ":" + "\r\n");
	                writer.write(max + " " + st + " " + en + "\r\n");
	                writer.flush();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	    /**
	     * ��ȡ�������������
	     * 
	     * @return ���������
	     */
	    public static int getInt() {
	        int read;
	        int res = 0;
	        boolean isNegative = false;// �ǲ��Ǹ���
	        try {
	            while ((read = reader.read()) != -1) {
	                if ((char) read == '-') {
	                    res = 0;
	                    isNegative = true;
	                    break;
	                } else if (isNumber((char) read)) {
	                    res = read - '0';
	                    break;
	                }
	            }
	            while ((read = reader.read()) != -1) {
	                char ch = (char) read;
	                if (isNumber(ch)) {
	                    res = res * 10 + (read - '0');
	                } else {
	                    break;
	                }
	            }
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        if (isNegative == true) {
	            res = -1 * res;
	        }
	        return res;
	    }
	 
	    /**
	     * �ж��ַ��Ƿ�հ�
	     * 
	     * @param ch
	     *            �ַ�
	     * @return �жϽ��
	     */
	    public static boolean isBlank(char ch) {
	        if (ch == '\r' || ch == '\n' || ch == ' ') {
	            return true;
	        }
	        return false;
	    }
	 
	    /**
	     * �ж��ַ��ǲ�������
	     * 
	     * @param ch
	     *            �ַ�
	     * @return �жϽ��
	     */
	    public static boolean isNumber(char ch) {
	        if (ch <= '9' && ch >= '0') {
	            return true;
	        }
	        return false;
	    }
}
