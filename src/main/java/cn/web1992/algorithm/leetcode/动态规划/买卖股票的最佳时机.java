package cn.web1992.algorithm.leetcode.动态规划;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn8fsh/}
 */
public class 买卖股票的最佳时机 {

    public static void main(String[] args) {

        new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }

    static class Solution {
        public int maxProfit(int[] prices) {

            int len = prices.length;
            if (len == 0) {
                return 0;
            }

            int[][] dp = new int[len][2];
            dp[0][0] = 0;// 没有持有股票 的利润
            dp[0][1] = -prices[0];// 持有股票 的利润

            for (int i = 1; i < len; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                dp[i][1] = Math.max(-prices[i], dp[i - 1][1]);
            }

            return dp[len - 1][0];
        }
    }
}
