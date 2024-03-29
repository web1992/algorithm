package cn.web1992.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/3/7  11:05 下午
 * @link {https://www.bilibili.com/video/BV1cS4y137mg}
 * @link {https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/}
 */
public class 买卖股票的最佳时机2 {
    public static void main(String[] args) {

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        //System.out.println(maxProfit(prices));
        System.out.println(new Solution().maxProfit(prices));

    }


    // 动态规划
    static class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int[][] dp = new int[n][2];
            dp[0][0] = 0;// 没有持有股票
            dp[0][1] = -prices[0]; // 持有股票
            for (int i = 1; i < n; ++i) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            }

            for (int i = 0; i < dp.length; i++) {
                System.out.print(Arrays.toString(dp[i]));
                System.out.println();
            }
            System.out.println();
            return dp[n - 1][0];
        }
    }


}
