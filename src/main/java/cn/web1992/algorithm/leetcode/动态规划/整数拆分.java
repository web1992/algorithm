package cn.web1992.algorithm.leetcode.动态规划;

/**
 * @link {https://leetcode.cn/problems/integer-break/}
 * @link {https://programmercarl.com/0343.%E6%95%B4%E6%95%B0%E6%8B%86%E5%88%86.html#}
 */
public class 整数拆分 {

    public static void main(String[] args) {
        int ans = new Solution().integerBreak(4);
        System.out.println(ans);
    }

    static class Solution {
        public int integerBreak(int n) {

            int[] dp = new int[n + 1];
            dp[2] = 1;

            for (int i = 3; i <= n; i++) {
                for (int j = 1; j <= i - j; j++) {
                    dp[i] = Math.max(dp[i], Math.max(dp[i - j] * j, j * (i - j)));
                }
            }

            return dp[n];
        }
    }
}
