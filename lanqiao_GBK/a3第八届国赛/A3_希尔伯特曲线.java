package lanqiao_GBK.a3第八届国赛�ڰ˽����;
/**
 * ϣ����������������һϵ�з������� Hn �ļ��ޡ����ǿ��԰� Hn ����һ������ 2^n �� 2^n �����������ߣ�������һ���� 2^n �� 2^n ������(�������½��������½��յ�)��ǡ�ø���ÿ������һ�Ρ�

[p1.png]

Hn(n > 1)����ͨ�����·������죺
1. �� Hn-1 ˳ʱ����ת90�ȷ������½�
2. �� Hn-1 ��ʱ����ת90�ȷ������½�
3. ��2�� Hn-1 �ֱ�������ϽǺ����Ͻ�
4. ��3����λ�߶ΰ�4������������

���� Hn ��ÿһ������ p �����Ƕ��� p �������������ǵ�С�����ھ����е�����(���½���(1, 1)�����Ͻ���(2^n, 2^n)����������X�������򣬴��µ�����Y��������)��
���� p ����������������ϴ���㿪ʼ���ڼ�������(��1��ʼ����)��

���³�����ڸ�����n(n <= 30)��p������(x, y)�����p�����š�����ϸ�Ķ�����Դ�룬��д���߲���ȱʧ�����ݡ�

import java.util.Scanner;
	
public class HilbertCurve {
    public static long f(int n, int x, int y) {
	if (n == 0) return 1;
        int m = 1 << (n - 1);
        if (x <= m && y <= m) {
                return f(n - 1, y, x);
        }
        if (x > m && y <= m) {
                return 3L * m * m + f(n - 1, ________________ , m * 2 - x + 1); //���
        }
        if (x <= m && y > m) {
                return 1L * m * m + f(n - 1, x, y - m);
        }
        if (x > m && y > m) {
                return 2L * m * m + f(n - 1, x - m, y - m);
        }
	return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
	int x = in.nextInt();
	int y = in.nextInt();
        
        System.out.println(f(n, x, y));
    }
}
 * @author DELL
 *
 */
public class A3_ϣ���������� {

}
