package cn.web1992.algorithm.leetcode.test;

/**
 * @link {https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/}
 */
public class 买卖股票的最佳时机Test04 {

    public static void main(String[] args) {

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int ans = new Solution().maxProfit(prices);
        System.out.println(ans);
    }


    static class Solution {
        public int maxProfit(int[] prices) {

            int len = prices.length;
            int[][] dp = new int[len][2];
            // dp[0] 卖出股票的最大价值
            // dp[1] 买股票的最大价值

            dp[0][1] = -prices[0];
            dp[0][0] = 0;

            for (int i = 1; i < len; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);// 卖出
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);// 买入
            }

            return dp[len - 1][0];
        }
    }
}
