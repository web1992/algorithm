package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/7/26  21:46
 * @link {https://leetcode.cn/problems/unique-paths-ii/}
 * @link {https://programmercarl.com/0063.%E4%B8%8D%E5%90%8C%E8%B7%AF%E5%BE%84II.html}
 */
public class 不同路径II {
    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};

        int[][] arr2 = new int[][]{
                {0, 0},
                {1, 1},
                {0, 0}};
        int ans = new Solution().uniquePathsWithObstacles(arr2);
        System.out.println(ans);
    }


    static class Solution {

        public int uniquePathsWithObstacles(int[][] obstacleGrid) {

            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;

            if (obstacleGrid[m - 1][n - 1] == 1 || obstacleGrid[0][0] == 1) {
                return 0;
            }

            int[][] dp = new int[m][n];

            for (int i = 0; i < m; i++) {
                if (obstacleGrid[i][0] == 1) {
                    break;
                }
                dp[i][0] = 1;
            }
            for (int i = 0; i < n; i++) {
                if (obstacleGrid[0][i] == 1) {
                    break;
                }
                dp[0][i] = 1;

            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (obstacleGrid[i][j] == 0) {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    }
                }
            }

            return dp[m - 1][n - 1];
        }
    }
}
