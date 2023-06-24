package cn.web1992.algorithm.leetcode.test;

/**
 * @link {https://leetcode.cn/problems/min-cost-climbing-stairs/}
 */
public class 使用最小花费爬楼梯_Test {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 30, 40, 50, 1};
        int ans = new Solution().minCostClimbingStairs(arr);
        System.out.println(ans);
    }

    static class Solution {

        public int minCostClimbingStairs(int[] arr) {

            int len = arr.length;
            int[] dp = new int[len];

            dp[0] = arr[0];
            dp[1] = arr[1];

            // [1,2,30,40,50,1]
            for (int i = 2; i < len; i++) {
                dp[i] = Math.min(dp[i - 1] + arr[i], dp[i - 2] + arr[i]);
            }

            // 选择最小的
            return Math.min(dp[len - 1], dp[len - 2]);

        }
    }

}
