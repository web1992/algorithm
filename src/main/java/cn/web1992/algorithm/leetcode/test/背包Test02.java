package cn.web1992.algorithm.leetcode.test;

public class 背包Test02 {
    public static void main(String[] args) {


        int[] weight = {1, 3, 4};// 物品的重量
        int[] value = {15, 20, 30};// 物品的价值
        int bagSize = 4;// 背包的容量

        int ans = new Solution().maxValue(weight, value, bagSize);
        System.out.println("ans=" + ans);
    }

    static class Solution {
        public int maxValue(int[] weight, int[] values, int bagSize) {
            int len = weight.length;
            int[][] dp = new int[len + 1][bagSize + 1];

            for (int i = 0; i < len; i++) {
                dp[i][0] = 0;
            }

            for (int i = 1; i <= len; i++) {
                for (int j = 1; j <= bagSize; j++) {

                    if (j < weight[i - 1]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + values[i - 1]);
                    }
                }
            }
            return dp[len][bagSize];
        }
    }
}
