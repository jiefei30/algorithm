package other.weeklyAlgorithm;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) throws Exception {
		StudentTest stu = new StudentTest();
				stu.StuN();
				stu.shuru();
				stu.con();
				stu.line();
				stu.cha();
			}
}
class StudentTest{
	public int n;
	public int num[] = new int[35];// ѧ��
	public int a1[] = new int[35];
	public int a2[] = new int[35];
	public int a3[] = new int[35];
	public int a4[] = new int[35];
	public double ave[] = new double[35];// ƽ����
	public double tota[] = new double[35];// �ܷ�
	public int qu[]= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
			26, 27, 28, 29, 30, 31, 32, 33, 34};	
	public void StuN() throws Exception
	  {
	    System.out.println("������ѧ��������������35��:");
	    Scanner input=new Scanner(System.in);
	    this.n=input.nextInt();
	    if(n>35)
	    {
	    	throw new Exception("�Ƿ��������룡");
	    }
	  }
	public void shuru() {
		int j=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("������ÿ��ѧ����ѧ�ź����ſγɼ�,���Կո����");
		for(int i=0;i<n;i++) {
			String str = scan.nextLine();
			String[] strs = str.split(" ");
			num[i] = Integer.parseInt(strs[0]);
			a1[i] = Integer.parseInt(strs[1]);
			a2[i] = Integer.parseInt(strs[2]);
			a3[i] = Integer.parseInt(strs[3]);
			a4[i] = Integer.parseInt(strs[4]);
		}
	}// ¼��ѧ����Ϣ
	public void con() {
		int i = 0;
		do {
			tota[i] = a1[i] + a2[i] + a3[i] + a4[i];
			ave[i] = tota[i] / 4;
			i++;
		} while (i<n);
	}// ����ƽ���ֺ��ܷ�
	public void line() {
		double pp[] = new double[35];
		for(int i = 0; i < n; i++) {
			pp[i]=tota[i];
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n- i; j++) {
				if (pp[j] < pp[j + 1]) {
					double xx=pp[j];
					pp[j]=pp[j+1];
					pp[j+1]=xx;
					int cun = qu[j];
					qu[j] = qu[j + 1];
					qu[j + 1] = cun;
				}
			}
		}
	//��������
		for(int i = 0; i < n ; i++) {
			int j=qu[i];
			i++;
			System.out.println("��"+i+"�� ѧ��Ϊ:"+num[j]+" ���Ƴɼ�Ϊ:"+a1[j]+" "+a2[j]+" "
					+a3[j]+" "+a4[j]+" ƽ����Ϊ:"+ave[j]+" �ܷ�Ϊ:"+tota[j]);
			i--;
		}//���������
	}//�������������
	public void cha() {
		String cc;
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ�Ŀγ̣��ֱ�Ϊa1,a2,a3,a4");
		cc=scan.next();
		switch(cc) {
			case "a1":
				for(int i=0;i<5;i++) {
					int j=qu[i];
					if(a1[j]>=90) {
						System.out.println("ѧ��Ϊ:"+num[j]+" ���Ƴɼ�Ϊ:"+a1[j]+" "+a2[j]+" "
								+a3[j]+" "+a4[j]+" ƽ����Ϊ:"+ave[j]+" �ܷ�Ϊ:"+tota[j]);
					}
				}break;
			case "a2":
				for(int i=0;i<5;i++) {
					int j=qu[i];
					if(a2[j]>=90) {
						System.out.println("ѧ��Ϊ:"+num[j]+" ���Ƴɼ�Ϊ:"+a1[j]+" "+a2[j]+" "
								+a3[j]+" "+a4[j]+" ƽ����Ϊ:"+ave[j]+" �ܷ�Ϊ:"+tota[j]);
				}
			}break;
			case "a3":
				for(int i=0;i<5;i++) {
					int j=qu[i];
					if(a3[j]>=90) {
						System.out.println("ѧ��Ϊ:"+num[j]+" ���Ƴɼ�Ϊ:"+a1[j]+" "+a2[j]+" "
								+a3[j]+" "+a4[j]+" ƽ����Ϊ:"+ave[j]+" �ܷ�Ϊ:"+tota[j]);
				}
			}break;
			case "a4":
				for(int i=0;i<5;i++) {
					int j=qu[i];
					if(a4[j]>=90) {
						System.out.println("ѧ��Ϊ:"+num[j]+" ���Ƴɼ�Ϊ:"+a1[j]+" "+a2[j]+" "
								+a3[j]+" "+a4[j]+" ƽ����Ϊ:"+ave[j]+" �ܷ�Ϊ:"+tota[j]);
				}
			}break;
			default:System.out.println("δ��ѯ�����ſγ�");
		}//ѡ�����
	}
}