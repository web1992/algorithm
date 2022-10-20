package cn.web1992.algorithm.leetcode.动态规划;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn854d/}
 */
public class 爬楼梯_动态规划 {

    public static void main(String[] args) {

    }

    static class Solution {

        public int climbStairs(int n) {

            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            int[] dp = new int[n];
            dp[0] = 1;
            dp[1] = 2;

            for (int i = 2; i < n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n - 1];
        }
    }
}
