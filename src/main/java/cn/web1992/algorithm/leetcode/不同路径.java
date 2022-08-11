package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/6/28  11:39
 * @link {https://leetcode.cn/problems/unique-paths/}
 * @link {https://programmercarl.com/0062.%E4%B8%8D%E5%90%8C%E8%B7%AF%E5%BE%84.html}
 */
public class 不同路径 {

    public static void main(String[] args) {

        int ans = new Solution().uniquePaths(3, 7);
        System.out.println(ans);
    }

    static class Solution {

        /**
         * 动态规划
         *
         * @param m
         * @param n
         * @return
         */
        public int uniquePaths(int m, int n) {

            int[][] dp = new int[m][n];

            for (int i = 0; i < m; i++) {
                dp[i][0] = 1;
            }
            for (int j = 0; j < n; j++) {
                dp[0][j] = 1;
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }

            return dp[m - 1][n - 1];
        }
    }
}
