package lanqiao_GBK.a2第七届国赛���߽����;
/**
 * X�����ŭ��С��ϲ��ײ�𳵣�

һ��ƽֱ�����������𳵼���� 1000 ��
���� ��������A��B�� ��ʱ�� 10��/�� �����ʻ��

��ŭ��С���A��������ʱ��50��/�룬ײ��B����
Ȼ�󷵻�ȥײA�����ٷ���ȥײB�����������....
���������1�״�ͣ����

�ʣ����ڼ��ŭ��С��ײ B �����ٴΣ�

 * @author DELL
 *
 */
public class B1_��ŭС�� {
	public static void main(String[] args) {
		 int count=0;
		 double s = 1000;
		 while(s>1) {
			 System.out.println(s);
			 s = s-(s/60)*20;
			 count++;
		 }
		   
		 System.out.println(count);
	}
}
