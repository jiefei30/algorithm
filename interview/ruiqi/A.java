package interview.ruiqi;

/**
 * @author Wangmingcan
 * @date 2021/12/4 16:12
 * @description
 */
public class A {
    public void sout(String[][] items, int[] weight) {
        int round = -1;
        int len = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].length % weight[i] == 0) {
                round = Math.max(items[i].length/weight[i], round);
            }else {
                round = Math.max(items[i].length/weight[i]+1, round);
            }
            len += items[i].length;
        }
        String[] res = new String[len];
        int index = 0;
        for (int i = 0; i < round; i++) {
            for (int j = 0; j < items.length; j++) {
                for (int k = i*weight[j]; k < items[i].length && k < (i+1)*weight[j]; k++) {
                    res[index++] = items[j][k];
                }
            }
        }
    }
}
