package lanqiao.c算法训练;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 问题描述
有一棵 n 个节点的树，树上每个节点都有一个正整数权值。如果一个点被选择了，那么在树上和它相邻的点都不能被选择。求选出的点的权值和最大是多少？

输入格式
第一行包含一个整数 n 。

接下来的一行包含 n 个正整数，第 i 个正整数代表点 i 的权值。

接下来一共 n-1 行，每行描述树上的一条边。

输出格式
输出一个整数，代表选出的点的权值和的最大值。
样例输入
5
1 2 3 4 5
1 2
1 3
2 4
2 5
样例输出
12
样例说明
选择3、4、5号点，权值和为 3+4+5 = 12 。
数据规模与约定
对于20%的数据， n <= 20。

对于50%的数据， n <= 1000。

对于100%的数据， n <= 100000。

权值均为不超过1000的正整数。
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
