package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/problems/unique-paths-ii/}
 * @link {https://programmercarl.com/0063.%E4%B8%8D%E5%90%8C%E8%B7%AF%E5%BE%84II.html#%E6%80%BB%E7%BB%93}
 */
public class 不同路径II {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ans = new Solution().uniquePathsWithObstacles(arr);
        System.out.println(ans);

    }


    static class Solution {

        public int uniquePathsWithObstacles(int[][] obstacleGrid) {

            int ans = 0;
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] dp = new int[m][n];
            // 列 初始化
            for (int i = 0; i < m; i++) {
                if (obstacleGrid[i][0] == 1) {
                    break;
                }
                dp[i][0] = 1;
            }

            // 行 初始化
            for (int i = 0; i < n; i++) {
                if (obstacleGrid[0][i] == 1) {
                    break;
                }
                dp[0][i] = 1;
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (dp[i][j] == 1) {
                        continue;
                    }
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }

            return dp[m - 1][n - 1];
        }
    }
}
