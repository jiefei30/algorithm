package lanqiao_GBK.c算法训练

�㷨ѵ��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ��������
��һ�� n ���ڵ����������ÿ���ڵ㶼��һ��������Ȩֵ�����һ���㱻ѡ���ˣ���ô�����Ϻ������ڵĵ㶼���ܱ�ѡ����ѡ���ĵ��Ȩֵ������Ƕ��٣�

�����ʽ
��һ�а���һ������ n ��

��������һ�а��� n ������������ i ������������� i ��Ȩֵ��

������һ�� n-1 �У�ÿ���������ϵ�һ���ߡ�

�����ʽ
���һ������������ѡ���ĵ��Ȩֵ�͵����ֵ��
��������
5
1 2 3 4 5
1 2
1 3
2 4
2 5
�������
12
����˵��
ѡ��3��4��5�ŵ㣬Ȩֵ��Ϊ 3+4+5 = 12 ��
���ݹ�ģ��Լ��
����20%�����ݣ� n <= 20��

����50%�����ݣ� n <= 1000��

����100%�����ݣ� n <= 100000��

Ȩֵ��Ϊ������1000����������
 * @author DELL
 *
 */
public class ALGO_004 {
    private static int[][] dp;
    private static List<List<Integer>> v = new ArrayList<>();
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n][2];
        final String[] valueString = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            dp[i][1] = Integer.parseInt(valueString[i]);
            v.add(new ArrayList<Integer>());
        }
        
        for (int i = 0; i < n - 1; i++) {
            final String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]) - 1, b = Integer.parseInt(ab[1]) - 1;
            v.get(a).add(b);
            v.get(b).add(a);
        }
        br.close();
        dfs(0, -1);
        System.out.println(Math.max(dp[0][0], dp[0][1]));
    }
    
    private static void dfs(int root, int pre) {
        List<Integer> temp = v.get(root);
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) != pre) {
                dfs(temp.get(i), root);
                dp[root][1] += dp[temp.get(i)][0];
                dp[root][0] += Math.max(dp[temp.get(i)][0], dp[temp.get(i)][1]);
            }
        }
    }

}
