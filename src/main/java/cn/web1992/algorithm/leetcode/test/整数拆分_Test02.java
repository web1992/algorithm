package cn.web1992.algorithm.leetcode.test;

public class 整数拆分_Test02 {

    public static void main(String[] args) {

        int num = 10;
        int ans = new Solution().integerBreak(num);
        System.out.println("ans=" + ans);
    }


    static class Solution {

        // 拆分，最大乘积
        public int integerBreak(int n) {

            int[] dp = new int[n + 1];
            // dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            dp[2] = 1;

            for (int i = 3; i <= n; i++) {
                for (int j = 1; j < i - 1; j++) {
                    dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
                }
            }

            return dp[n];
        }

    }

}
