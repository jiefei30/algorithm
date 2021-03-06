package lanqiao.a2第七届国赛;
/**
 * 生物学家正在对n个物种进行研究。
其中第i个物种的DNA序列为s[i]，其中的第j个碱基为s[i][j],碱基一定是A、T、G、C之一。
生物学家想找到这些生物中一部分生物的一些共性，他们现在关注那些至少在m个生物中出现的长度为k的连续碱基序列。准确的说，科学家关心的序列用2m元组(i1,p1,i2,p2....im,pm)表示，
满足:
1<=i1<i2<....<im<=n;
且对于所有q(0<=q<k), s[i1][p1+q]=s[i2][p2+q]=....=s[im][pm+q]。

现在给定所有生物的DNA序列，请告诉科学家有多少的2m元组是需要关注的。如果两个2m元组有任何一个位置不同，则认为是不同的元组。

【输入格式】
输入的第一行包含三个整数n、m、k，两个整数之间用一个空格分隔，意义如题目所述。
接下来n行，每行一个字符串表示一种生物的DNA序列。
DNA序列从1至n编号，每个序列中的碱基从1开始依次编号，不同的生物的DNA序列长度可能不同。

【输出格式】
输出一个整数，表示关注的元组个数。
答案可能很大，你需要输出答案除以1000000007的余数。

【样例输入】
3 2 2
ATC
TCG
ACG

【样例输出】
2

再例如：
【样例输入】
4 3 3
AAA
AAAA
AAA
AAA

【样例输出】
7


【数据规模与约定】
对于20%的数据，k<=5,所有字符串总长L满足L <=100
对于30%的数据，L<=10000
对于60%的数据，L<=30000
对于100%的数据，n<=5,m<=5,1<=k<=L<=100000
保证所有DNA序列不为空且只会包含’A’ ’G’ ’C’ ’T’四种字母

资源约定：
峰值内存消耗 < 256M
CPU消耗  < 1000ms
 * @author DELL
 *
 */
public class C6_碱基 {

}
