package codetop;

/**
 * @author Wangmingcan
 * @date 2021/10/20 20:09
 * @description 买卖股票的最佳时机
 */
public class A121 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    static class Solution {
        public int maxProfit(int[] prices) {
            int res = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < prices.length; i++) {
                if (min > prices[i]) {
                    min = prices[i];
                }else {
                    res = Math.max(res, prices[i] - min);
                }
            }
            return res;
        }
    }
}
