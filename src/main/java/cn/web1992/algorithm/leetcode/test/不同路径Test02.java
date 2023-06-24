package cn.web1992.algorithm.leetcode.test;

/**
 * @link {https://leetcode.cn/problems/unique-paths/}
 */
public class 不同路径Test02 {

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int ans = new Solution().uniquePaths(m, n);
        System.out.println("ans=" + ans);

    }


    static class Solution {
        public int uniquePaths(int m, int n) {

            int[][] dp = new int[m][n];

            // dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            for (int i = 0; i < m; i++) {
                dp[i][0] = 1;
            }

            for (int j = 0; j < n; j++) {
                dp[0][j] = 1;
            }

            System.out.println("n=" + n);
            int i = 1;
            while (i < m) {
                int j = 1;
                while (j < n) {
                    System.out.println("i=" + i + " j=" + j);
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    j++;
                }
                i++;
            }

            /*for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    System.out.println("i=" + i + " j=" + j);
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }*/

            /*for (int k = 0; k < m; k++) {
                for (int l = 0; l < n; l++) {
                    System.out.print(dp[k][l] + ",");
                }
                System.out.println();
            }*/

            return dp[m - 1][n - 1];
        }

    }

}

