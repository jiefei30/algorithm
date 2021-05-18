package other.weeklyAlgorithm;
/**
 * Լɪ������
 * �ݹ�+����
 */
import java.util.ArrayList;
import java.util.Scanner;

public class T4_1 {
		static int m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();   //������
		m = sc.nextInt();		//������				
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0,t=1;i<n;i++,t++) {		//���ϳ�ʼ��
			arr.add(t);
		}
		out(arr,0);        //��ʼ�ݹ�
	}
	public static void out(ArrayList<Integer> arr,int index) {       //�����ǵ�ǰ���Ϻ͵�ǰ����
		if(arr.size()==0) return;			//�ݹ����
		else for(int i=0;i<m;i++) {
			if(i==m-1) {					//�������m��
				System.out.println(arr.get(index));		//�����ǰ������
				arr.remove(index);						//�Ƴ���ǰ����
				if(index > arr.size()-1) index=0; 		//�����ʱ�������ڼ��ϣ�����ָ���һ����
				out(arr,index);							//�ٴεݹ�
			}
			index++;									//û�е�m�Σ�ָ����һ����
			if(index > arr.size()-1) index=0; 			//�����ʱ�������ڼ��ϣ�����ָ���һ����
		}
	}
}
